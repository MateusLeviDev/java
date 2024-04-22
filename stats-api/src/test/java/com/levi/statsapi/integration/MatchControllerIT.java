package com.levi.statsapi.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.hamcrest.Matchers.containsString;
import com.levi.statsapi.domain.Match;
import com.levi.statsapi.domain.Team;
import com.levi.statsapi.dto.Match.MatchRequestDTO;
import com.levi.statsapi.repository.MatchRepository;
import com.levi.statsapi.repository.TeamRepository;
import com.levi.statsapi.util.Match.MatchCreator;
import com.levi.statsapi.util.Match.MatchPostCreator;
import com.levi.statsapi.util.Team.TeamCreator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.io.IOException;
import java.util.Arrays;

import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MatchControllerIT {
    private static final MediaType CONTENT_TYPE =
            new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype());
    private MockMvc mockMvc;

    // Suppressing warning about the use of raw types for mappingJackson2HttpMessageConverter
    @SuppressWarnings("rawtypes")
    private HttpMessageConverter mappingJackson2HttpMessageConverter;
    @Autowired
    private WebApplicationContext webApplicationContext;
    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private TeamRepository teamRepository;

    /*
     This method searches for the specific Jackson HTTP message converter (MappingJackson2HttpMessageConverter)
     in the list of converters injected by Spring and assigns it to the variable mappingJackson2HttpMessageConverter.
     This is essential to ensure that the application can convert Java objects to JSON and vice versa
     during HTTP communication operations.
    */
    @Autowired
    public void setConverters(HttpMessageConverter<?>[] converters) {
        mappingJackson2HttpMessageConverter = Arrays.stream(converters)
                .filter(hmc -> hmc instanceof MappingJackson2HttpMessageConverter).findAny().orElse(null);
        Assertions.assertNotNull(this.mappingJackson2HttpMessageConverter,
                "the JSON message converter must not be null");
    }
    @SuppressWarnings("unchecked")
    protected String json(Object o) throws IOException {
        MockHttpOutputMessage mockHttpOutputMessage = new MockHttpOutputMessage();
        mappingJackson2HttpMessageConverter.write(o, MediaType.APPLICATION_JSON, mockHttpOutputMessage);
        return mockHttpOutputMessage.getBodyAsString();
    }

    @BeforeEach
    public void init() {
        mockMvc = webAppContextSetup(webApplicationContext).build();
        Team teamOneToBeSaved = TeamCreator.createTeamOneToBeSaved();
        Team teamTwoToBeSaved = TeamCreator.createTeamTwoToBeSaved();

        teamRepository.save(teamOneToBeSaved);
        teamRepository.save(teamTwoToBeSaved);
//        UserEntity user1 = new UserEntity("Carlos", 29, "carlos@yopmail.com");
//        UserEntity user2 = new UserEntity("Luis", 25, "luis@yopmail.com");
//        userRepository.create(user1);
//        userRepository.create(user2);
    }


    @Test
    @DisplayName("should create a new match")
    void save_ReturnsAnime_WhenSuccessful() throws Exception {
        MatchRequestDTO matchPostRequest = MatchPostCreator.createMatchPostRequest();
        String json = new ObjectMapper().writeValueAsString(matchPostRequest);

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/match")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isCreated());
    }
}


