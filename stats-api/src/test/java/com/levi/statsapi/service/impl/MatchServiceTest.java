package com.levi.statsapi.service.impl;

import com.levi.statsapi.domain.Match;
import com.levi.statsapi.repository.MatchRepository;
import com.levi.statsapi.util.Match.MatchCreator;
import com.levi.statsapi.util.Match.MatchPostCreator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@ExtendWith(SpringExtension.class)
class MatchServiceTest {

    @InjectMocks
    private MatchServiceImpl matchService;

    @Mock
    private MatchRepository matchRepositoryMock;

    @Mock
    private ModelMapper modelMapper;

    @BeforeEach
    void setup() {

        PageImpl<Match> matchPage = new PageImpl<>(List.of(MatchCreator.createValidMatch()));

        BDDMockito.when(matchRepositoryMock.findAll(any(PageRequest.class)))
                .thenReturn(matchPage);

        BDDMockito.when(matchRepositoryMock.findAll())
                .thenReturn(List.of(MatchCreator.createValidMatch()));

        BDDMockito.when(matchRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(MatchCreator.createValidMatch()));

        BDDMockito.when(matchRepositoryMock.save(any(Match.class)))
                .thenReturn(MatchCreator.createValidMatch());

        BDDMockito.doNothing().when(matchRepositoryMock).delete(any(Match.class));

        BDDMockito.given(modelMapper.map(any(), eq(Match.class)))
                .willReturn(MatchCreator.createValidMatch());
    }

    @Test
    @DisplayName("save returns match when successful")
    void testSave_WhenSuccessful_ReturnsMatch() {
        //ARRANGE
        Match matchToBeSaved = MatchCreator.createMatchToBeSaved();
        Match validMatch = MatchCreator.createValidMatch();

        //ACT
        Match savedMatch = matchService.registerMatch(MatchPostCreator.createMatchPostRequest());

        //ASSERT
        Mockito.when(matchRepositoryMock.save(matchToBeSaved)).thenReturn(validMatch);
        Assertions.assertThat(matchToBeSaved).usingRecursiveComparison().isEqualTo(validMatch);
        Assertions.assertThat(savedMatch.getId()).isNotNull();
        Assertions.assertThat(savedMatch.getTeamOne().getId()).isEqualTo(matchToBeSaved.getTeamOne().getId());
        Assertions.assertThat(savedMatch.getTeamTwo().getId()).isEqualTo(matchToBeSaved.getTeamTwo().getId());
    }

    @Test
    @DisplayName("getByIdOrThrowBadRequestException throws BadRequestException when match  is not found")
    void testGetByIdOrThrowBadRequestException_WhenMatchIsNotFound_ThrowsBadRequestException() {
        BDDMockito.when(matchRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.empty());

        Assertions.assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(() -> matchService.getByIdOrThrowBadRequestException(1L));
    }

    @Test
    @DisplayName("GetAllNonPageable returns list of match when successful")
    void testGetAllNonPageable_WhenSuccessful_ReturnListOfMatch() {
        //ARRANGE
        Long id = MatchCreator.createValidMatch().getTeamOne().getId();

        //ACT
        List<Match> allMatchNonPageable = matchService.getAllMatchNonPageable();

        //ASSERT
        Assertions.assertThat(allMatchNonPageable)
                .isNotNull()
                .isNotEmpty()
                .hasSize(1);

        Assertions.assertThat(allMatchNonPageable.get(0).getTeamOne().getId())
                .isEqualTo(id);
    }

    @Test
    @DisplayName("GetAllPageable returns list of match when successful")
    void testGetAllPageable_WhenSuccessful_ReturnListOfMatch() {
        //ARRANGE
        Long id = MatchCreator.createValidMatch().getTeamOne().getId();

        //ACT
        Page<Match> allPageable = matchService.getAllPageable(PageRequest.of(1, 1));

        //ASSERT
        Assertions.assertThat(allPageable).isNotNull();

        Assertions.assertThat(allPageable.toList())
                .isNotEmpty()
                .hasSize(1);

        Assertions.assertThat(allPageable.toList().get(0).getTeamOne().getId())
                .isEqualTo(id);
    }

    @Test
    @DisplayName("Update match when successful")
    void testReplace_WhenSuccessful_UpdatesMatch() {

        Assertions.assertThatCode(() -> matchService.updateMatch(MatchPostCreator.createMatchPostRequest()))
                .doesNotThrowAnyException();

    }

    @Test
    @DisplayName("Delete match when successful")
    void testDelete_WhenSuccessful_RemovesMatch() {

        Assertions.assertThatCode(() -> matchService.deleteMatch(1L))
                .doesNotThrowAnyException();

    }
}