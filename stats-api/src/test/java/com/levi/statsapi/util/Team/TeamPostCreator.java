package com.levi.statsapi.util.Team;

import com.levi.statsapi.dto.Team.TeamRequestDTO;

public class TeamPostCreator {
    public static TeamRequestDTO createTeamPostRequest() {
        return TeamRequestDTO.builder()
                .id(TeamCreator.createValidTeam().getId())
                .state(TeamCreator.createValidTeam().getState())
                .name(TeamCreator.createValidTeam().getName())
                .photoUrl(TeamCreator.createValidTeam().getPhotoUrl())
                .build();
    }
}
