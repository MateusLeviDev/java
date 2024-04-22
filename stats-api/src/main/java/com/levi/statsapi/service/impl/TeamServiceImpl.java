package com.levi.statsapi.service.impl;

import com.levi.statsapi.domain.Team;
import com.levi.statsapi.dto.Team.TeamRequestDTO;
import com.levi.statsapi.repository.TeamRepository;
import com.levi.statsapi.service.TeamService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;
    private final ModelMapper modelMapper;


    public TeamServiceImpl(TeamRepository teamRepository, ModelMapper modelMapper) {
        this.teamRepository = teamRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Team createteam(TeamRequestDTO teamRequestDTO) {

        if (this.teamRepository.existsByName(teamRequestDTO.getName())) {
            throw new RuntimeException("Name already registered");
        }

        return this.teamRepository.save(modelMapper.map(teamRequestDTO, Team.class));
    }

    @Override
    public Team getByIdOrThrowBadRequestException(Long teamId) {
        return this.teamRepository.findById(teamId).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "Error"));
    }

    @Override
    public List<Team> getAllTeamsNonPageable() {
        return this.teamRepository.findAll();
    }

    @Override
    public Page<Team> getAllTeamsPageable(Pageable pageable) {
        return this.teamRepository.findAll(pageable);
    }

    @Override
    public void updateTeam(TeamRequestDTO teamRequestDTO) {
        Team savedTeamObject = this.teamRepository.findById(teamRequestDTO.getId())
                .orElseThrow(() -> new RuntimeException("Id already exists"));

        Team newTeam = modelMapper.map(teamRequestDTO, Team.class);
        newTeam.setId(savedTeamObject.getId());
        newTeam.setName(teamRequestDTO.getName() != null ? teamRequestDTO.getName() : savedTeamObject.getName());
        newTeam.setState(teamRequestDTO.getState() != null ? teamRequestDTO.getState() : savedTeamObject.getState());
        newTeam.setPhotoUrl(teamRequestDTO.getPhotoUrl() != null ? teamRequestDTO.getPhotoUrl() : savedTeamObject.getPhotoUrl());

        this.teamRepository.save(newTeam);
    }

    @Override
    public void deleteTeam(Long teamId) {
        this.teamRepository.delete(this.getByIdOrThrowBadRequestException(teamId));
    }
}
