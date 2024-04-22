package com.levi.statsapi.repository;

import com.levi.statsapi.domain.Match;
import com.levi.statsapi.domain.Team;
import com.levi.statsapi.util.Match.MatchCreator;
import com.levi.statsapi.util.Team.TeamCreator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
@DisplayName("test for match repository")
class MatchRepositoryTest {

    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private TeamRepository teamRepository;

    @BeforeEach
    void setup() {
        Team teamOneToBeSaved = TeamCreator.createTeamOneToBeSaved();
        Team teamTwoToBeSaved = TeamCreator.createTeamTwoToBeSaved();

        teamRepository.save(teamOneToBeSaved);
        teamRepository.save(teamTwoToBeSaved);
    }

    @Test
    @DisplayName("Save creates Match")
    void testSaveAll_WhenSuccessful_ReturnSavedMatch() {
        //ARRANGE
        Match matchToBeSaved = MatchCreator.createMatchToBeSaved();

        //ACT
        Match saved = matchRepository.save(matchToBeSaved);

        //ASSERT
        Assertions.assertThat(saved).isNotNull();
        Assertions.assertThat(saved.getTeamOne().getId()).isNotNull();
        Assertions.assertThat(saved.getTeamTwo().getId()).isNotNull();
    }

    @Test
    @DisplayName("Find by id. Return Match")
    void testFindById_WhenSuccessful_ReturnsMatch() {
        //ARRANGE
        Match matchToBeSaved = MatchCreator.createMatchToBeSaved();

        //ACT
        Match saved = this.matchRepository.save(matchToBeSaved);
        Long id = saved.getId();

        Optional<Match> byId = this.matchRepository.findById(id);

        //ASSERT
        assertThat(byId.isPresent()).isTrue();
        assertThat(byId.get().getId()).isNotNull();

        Assertions.assertThat(byId)
                .isNotEmpty()
                .contains(saved);
    }

    @Test
    @DisplayName("Save update match when successful. ")
    void testSave_WhenSuccessful_UpdateMatch() {
        //ARRANGE
        Match matchToBeSaved = MatchCreator.createMatchToBeSaved();
        Match saved = this.matchRepository.save(matchToBeSaved);

        saved.setScoreTeamOne(3);
        //ACT
        Match updatedMatch = this.matchRepository.save(saved);

        //ASSERT
        Assertions.assertThat(updatedMatch).isNotNull();
        Assertions.assertThat(updatedMatch.getId()).isNotNull();
        assertThat(updatedMatch.getScoreTeamOne()).isEqualTo(3);
    }

    @Test
    @DisplayName("Delete match when successful")
    void testDelete_WhenSuccessful_RemovesMatch() {
        //ARRANGE
        Match matchToBeSaved = MatchCreator.createMatchToBeSaved();

        Match savedMatch = this.matchRepository.save(matchToBeSaved);

        //ACT
        this.matchRepository.delete(savedMatch);

        Optional<Match> deletedMatch = this.matchRepository.findById(savedMatch.getId());

        //ASSERT
        Assertions.assertThat(deletedMatch).isEmpty();
    }

    @Test
    @DisplayName("Find By id returns empty list when match is not found")
    void testFindById_WhenMatchIsNotFoundReturnEmptyList() {
        Optional<Match> matchId = this.matchRepository.findById(1L);

        Assertions.assertThat(matchId).isEmpty();
    }

}
