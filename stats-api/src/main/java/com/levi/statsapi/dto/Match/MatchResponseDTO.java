package com.levi.statsapi.dto.Match;

import com.levi.statsapi.domain.Match;
import com.levi.statsapi.domain.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatchResponseDTO {

    private LocalDate date;
    private Integer scoreTeamOne;
    private Integer scoreTeamTwo;
    private Team teamOne;
    private Team teamTwo;
    private Team supportedTeam;

    public MatchResponseDTO(Match match) {
        this.date = match.getDate();
        this.scoreTeamOne = match.getScoreTeamOne();
        this.scoreTeamTwo = match.getScoreTeamTwo();
        this.teamOne = match.getTeamOne();
        this.teamTwo = match.getTeamTwo();
        this.supportedTeam = match.getSupportedTeam();
    }

    public static Page<MatchResponseDTO> convert(Page<Match> match) {
        return match.map(MatchResponseDTO::new);
    }
}
