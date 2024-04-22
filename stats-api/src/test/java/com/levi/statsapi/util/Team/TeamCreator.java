package com.levi.statsapi.util.Team;

import com.levi.statsapi.domain.Team;

public class TeamCreator {
    public static Team createTeamOneToBeSaved() {
        return Team.builder()
                .id(1L)
                .state("RJ")
                .name("Flamengo")
                .photoUrl("https://upload.wikimedia.org/wikipedia/commons/9/93/Flamengo-RJ_%28BRA%29.png")
                .build();
    }

    public static Team createTeamTwoToBeSaved() {
        return Team.builder()
                .id(2L)
                .state("SP")
                .name("Palmeiras")
                .photoUrl("https://upload.wikimedia.org/wikipedia/commons/1/10/Palmeiras_logo.svg")
                .build();
    }

    public static Team createValidTeam() {
        return Team.builder()
                .id(1L)
                .state("RJ")
                .name("Flamengo")
                .photoUrl("https://upload.wikimedia.org/wikipedia/commons/9/93/Flamengo-RJ_%28BRA%29.png")
                .build();
    }
}
