package com.levi.statsapi.service.impl;

import com.levi.statsapi.domain.Match;
import com.levi.statsapi.domain.Team;
import com.levi.statsapi.dto.Report.ReportsResponseDTO;
import com.levi.statsapi.repository.MatchRepository;
import com.levi.statsapi.repository.TeamRepository;
import com.levi.statsapi.service.ReportService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ReportServiceImpl implements ReportService {

    private final TeamRepository teamRepository;
    private final MatchRepository matchRepository;

    public ReportServiceImpl(TeamRepository teamRepository, MatchRepository matchRepository) {
        this.teamRepository = teamRepository;
        this.matchRepository = matchRepository;
    }

    @Override
    public ReportsResponseDTO getAllReports() {
        Integer matchesQuantity = getMatchesQuantity();
        Integer winsQuantity = getWinsQuantity();
        Integer winPercentage = getWinPercentage();
        Team mostWatchedTeam = getMostWatchedTeam();
        Integer daysWithoutWatching = getDaysWithoutWatching();
        return new ReportsResponseDTO(matchesQuantity, winsQuantity, winPercentage, mostWatchedTeam, daysWithoutWatching);
    }

    @Override
    public Integer getMatchesQuantity() {
        return Math.toIntExact(matchRepository.count());
    }

    @Override
    public Integer getWinsQuantity() {

        List<Match> allMatches = this.matchRepository.findAll();

        return (int) allMatches.stream()
                .filter(match -> {
                    Integer scoreTeamOne = match.getScoreTeamOne();
                    Integer scoreTeamTwo = match.getScoreTeamTwo();

                    Long teamWinnerId = (scoreTeamOne > scoreTeamTwo) ? match.getTeamOne().getId() :
                            match.getTeamTwo().getId();

                    //check if the team ID is supported to add wins
                    return Objects.equals(match.getSupportedTeam().getId(), teamWinnerId);
                }).count();
    }

    @Override
    public int getWinPercentage() {
        List<Match> matches = matchRepository.findAll();

        double totalPoints = matches.size() * 3;
        double wonPoints = matches.stream()
                .mapToDouble(match -> {
                    Integer scoreTeamOne = match.getScoreTeamOne();
                    Integer scoreTeamTwo = match.getScoreTeamTwo();

                    long teamWinnerId = (scoreTeamOne > scoreTeamTwo) ? match.getTeamOne().getId() :
                            (scoreTeamOne < scoreTeamTwo) ? match.getTeamTwo().getId() :
                                    0L;

                    return (Objects.equals(match.getSupportedTeam().getId(), teamWinnerId)) ? 3 : 1;
                })
                .sum();

        if (totalPoints == 0) {
            return 0;
        }

        double winPercentage = (wonPoints / totalPoints) * 100;
        return (int) winPercentage;
    }


    @Override
    public Team getMostWatchedTeam() {
        return this.teamRepository.findMostWatchedTeam();
    }

    @Override
    public Integer getDaysWithoutWatching() {
        return this.matchRepository.getDaysWithoutWatching();
    }
}
