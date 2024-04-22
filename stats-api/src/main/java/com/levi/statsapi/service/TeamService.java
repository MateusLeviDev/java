package com.levi.statsapi.service;

import com.levi.statsapi.domain.Match;
import com.levi.statsapi.domain.Team;
import com.levi.statsapi.dto.Team.TeamRequestDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeamService {
    
    Team createteam(TeamRequestDTO teamRequestDTO);
    
    Team getByIdOrThrowBadRequestException(Long teamId);

    List<Team> getAllTeamsNonPageable();

    Page<Team> getAllTeamsPageable(Pageable pageable);

    void updateTeam(TeamRequestDTO   teamRequestDTO);

    void deleteTeam(Long teamId);
}
