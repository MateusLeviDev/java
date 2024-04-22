package com.levi.statsapi.controller;

import com.levi.statsapi.domain.Team;
import com.levi.statsapi.dto.Team.TeamRequestDTO;
import com.levi.statsapi.dto.Team.TeamResponseDTO;
import com.levi.statsapi.service.TeamService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    Logger LOGGER = LoggerFactory.getLogger(TeamController.class);

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public ResponseEntity<Team> createTeam(@RequestBody @Valid TeamRequestDTO teamRequestDTO) {
        return new ResponseEntity<>(teamService.createteam(teamRequestDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<TeamResponseDTO>> getAllTeamsPageable(@PageableDefault(sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<Team> allPageable = this.teamService.getAllTeamsPageable(pageable);
        return ResponseEntity.ok(TeamResponseDTO.convert(allPageable));
    }

    @GetMapping("/{teamId}")
    public ResponseEntity<Team> getTeamById(@PathVariable Long teamId) {
        return ResponseEntity.ok(this.teamService.getByIdOrThrowBadRequestException(teamId));
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> updateTeam(@RequestBody TeamRequestDTO teamRequestDTO) {
        this.teamService.updateTeam(teamRequestDTO);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{teamId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> deleteTeam(@PathVariable Long teamId) {
        this.teamService.deleteTeam(teamId);
        return ResponseEntity.noContent().build();
    }

}
