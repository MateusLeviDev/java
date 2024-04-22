package com.levi.statsapi.service.impl;

import com.levi.statsapi.domain.Team;
import com.levi.statsapi.repository.TeamRepository;
import com.levi.statsapi.util.Team.TeamCreator;
import com.levi.statsapi.util.Team.TeamPostCreator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class TeamServiceTest {

    @Mock
    private TeamRepository teamRepositoryMock;

    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    private TeamServiceImpl teamService;

    @BeforeEach
    void setup() {

        when(teamRepositoryMock.save(any(Team.class)))
                .thenReturn(TeamCreator.createValidTeam());

        BDDMockito.when(teamRepositoryMock.findAll())
                        .thenReturn(List.of(TeamCreator.createValidTeam()));

        BDDMockito.given(modelMapper.map(any(), eq(Team.class)))
                .willReturn(TeamCreator.createValidTeam());
    }

    @Test
    @DisplayName("save and returns team when successful")
    void testSave_WhenSuccessful_ReturnsTeam() {
        //arrange
        Team teamToBeSaved = TeamCreator.createTeamOneToBeSaved();
        Team validTeam = TeamCreator.createValidTeam();

        //act
        Team savedTeam = teamService.createteam(TeamPostCreator.createTeamPostRequest());

        //assert
        when(modelMapper.map(savedTeam, Team.class)).thenReturn(validTeam);
        Assertions.assertThat(teamToBeSaved).usingRecursiveComparison().isEqualTo(validTeam);
        Assertions.assertThat(savedTeam.getId()).isNotNull();

    }

    @Test
    @DisplayName("GetAllPageable returns list of teams when successful")
    void testGetAllNonPageable_WhenSuccessful_ReturnListOfTeams() {
        //arrange
        Long id = TeamCreator.createValidTeam().getId();

        //act
        List<Team> allTeamsNonPageable = teamService.getAllTeamsNonPageable();

        //assert
        Assertions.assertThat(allTeamsNonPageable)
                .isNotNull()
                .isNotEmpty()
                .hasSize(1);

        Assertions.assertThat(allTeamsNonPageable.get(0).getId())
                .isEqualTo(id);
    }
}