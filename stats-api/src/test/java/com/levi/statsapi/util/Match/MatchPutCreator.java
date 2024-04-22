package com.levi.statsapi.util.Match;

import com.levi.statsapi.dto.Match.MatchRequestDTO;

public class MatchPutCreator {
    public static MatchRequestDTO createMatchPutRequest() {
        return MatchRequestDTO.builder()
                .id(MatchCreator.createMatchToBeSaved().getId())
                .date(MatchCreator.createMatchToBeSaved().getDate())
                .teamOneId(MatchCreator.createMatchToBeSaved().getTeamOne().getId())
                .teamTwoId(MatchCreator.createMatchToBeSaved().getTeamTwo().getId())
                .scoreTeamTwo(MatchCreator.createMatchToBeSaved().getScoreTeamTwo())
                .scoreTeamOne(MatchCreator.createMatchToBeSaved().getScoreTeamOne())
                .supportedTeamId(MatchCreator.createMatchToBeSaved().getSupportedTeam().getId())
                .build();
    }
}
