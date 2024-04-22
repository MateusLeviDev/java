package com.levi.statsapi.service.impl;

import com.levi.statsapi.domain.Match;
import com.levi.statsapi.domain.Team;
import com.levi.statsapi.dto.Match.MatchRequestDTO;
import com.levi.statsapi.exception.BadRequestException;
import com.levi.statsapi.exception.ElementNotFoundException;
import com.levi.statsapi.repository.MatchRepository;
import com.levi.statsapi.repository.TeamRepository;
import com.levi.statsapi.service.MatchService;
import com.levi.statsapi.service.TeamService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;

@Service
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;
    private final TeamRepository teamRepository;
    private final ModelMapper modelMapper;
    private final TeamService teamService;

    public MatchServiceImpl(MatchRepository matchRepository, TeamRepository teamRepository, ModelMapper modelMapper, TeamService teamService) {
        this.matchRepository = matchRepository;
        this.teamRepository = teamRepository;
        this.modelMapper = modelMapper;
        this.teamService = teamService;
    }

    @Override
    public Match getByIdOrThrowBadRequestException(Long matchId) {
        return matchRepository.findById(matchId).orElseThrow(() -> new BadRequestException("ERROR_"));
    }

    @Override
    public List<Match> getAllMatchNonPageable() {
        return matchRepository.findAll();
    }

    @Override
    public Page<Match> getAllPageable(Pageable pageable) {
        return matchRepository.findAll(pageable);
    }

    @Override
    public Match registerMatch(MatchRequestDTO matchRequestDTO) {

        if (matchRequestDTO.getTeamOneId().equals(matchRequestDTO.getTeamTwoId())) {
            throw new RuntimeException("Teams Ids are equals");
        }

        matchRequestDTO.setDate(LocalDate.now());

        return matchRepository.save(modelMapper.map(matchRequestDTO, Match.class));

    }

    @Override
    public void updateMatch(MatchRequestDTO matchRequestDTO) {
        Match savedMatchObject = this.matchRepository.findById(matchRequestDTO.getId())
                .orElseThrow(() -> new ElementNotFoundException("Id not found"));

        Match newMatch = modelMapper.map(matchRequestDTO, Match.class);
        newMatch.setId(savedMatchObject.getId());
        newMatch.setDate(matchRequestDTO.getDate() != null ? matchRequestDTO.getDate() : savedMatchObject.getDate());

        newMatch.setScoreTeamOne(matchRequestDTO.getScoreTeamOne() != null ? matchRequestDTO.getScoreTeamOne() : savedMatchObject.getScoreTeamOne());
        newMatch.setScoreTeamTwo(matchRequestDTO.getScoreTeamTwo() != null ? matchRequestDTO.getScoreTeamTwo() : savedMatchObject.getScoreTeamTwo());

        matchRepository.save(newMatch);
    }

    @Override
    public void deleteMatch(Long matchId) {
        this.matchRepository.delete(this.getByIdOrThrowBadRequestException(matchId));
    }

    //SUPPORT METHODS *______________________________________*

    private void checkTeamIfNotNull(Long teamId, Consumer<Team> teamSetter) {
        if (teamId != null) {
            Team team = teamService.getByIdOrThrowBadRequestException(teamId);
            teamSetter.accept(team);
        }
    }

    private void validateTeamId(Long teamId, String message) {
        this.teamRepository.findById(teamId).orElseThrow(() -> new RuntimeException(message));
    }

    private void validateTeamsId(MatchRequestDTO matchRequestDTO) {
        if (matchRequestDTO.getTeamOneId().equals(matchRequestDTO.getTeamTwoId()))
            throw new RuntimeException("ERROR_2");

        validateTeamId(matchRequestDTO.getTeamOneId(), "Team id: " + matchRequestDTO.getTeamOneId() + " not found!");
        validateTeamId(matchRequestDTO.getTeamTwoId(), "Team id: " + matchRequestDTO.getTeamTwoId() + " not found!");
        validateTeamId(matchRequestDTO.getSupportedTeamId(), "Team id: " + matchRequestDTO.getSupportedTeamId() + " not found!");
    }

}
