package com.levi.statsapi.dto.Team;

import com.levi.statsapi.domain.Match;
import com.levi.statsapi.domain.Team;
import com.levi.statsapi.dto.Match.MatchResponseDTO;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.data.domain.Page;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamResponseDTO {

    private String name;
    private String state;
    private String photo_url;

    public TeamResponseDTO(Team team) {
        this.name = team.getName();
        this.state = team.getState();
        this.photo_url = team.getPhotoUrl();
    }

    public static Page<TeamResponseDTO> convert(Page<Team> team) {
        return team.map(TeamResponseDTO::new);
    }
}
