package com.levi.statsapi.controller;

import com.levi.statsapi.domain.Match;
import com.levi.statsapi.dto.Match.MatchRequestDTO;
import com.levi.statsapi.dto.Match.MatchResponseDTO;
import com.levi.statsapi.service.MatchService;
import org.modelmapper.ModelMapper;
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
@RequestMapping("/api/match")
public class MatchController {

    Logger LOGGER = LoggerFactory.getLogger(MatchController.class);

    private final MatchService matchService;

    public MatchController(MatchService matchService, ModelMapper modelMapper) {
        this.matchService = matchService;
    }

    @PostMapping
    public ResponseEntity<Match> createMatch(@RequestBody MatchRequestDTO matchRequestDTO) {
        return new ResponseEntity<>(this.matchService.registerMatch(matchRequestDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<MatchResponseDTO>> getAllMatchesPageable(@PageableDefault(sort = "id", direction = Sort.Direction.DESC, size = 15) Pageable pageable) {
        Page<Match> allPageable = this.matchService.getAllPageable(pageable);
        return ResponseEntity.ok(MatchResponseDTO.convert(allPageable));
    }

    @GetMapping("/{matchId}")
    public ResponseEntity<Match> getMatchById(@PathVariable Long matchId) {
        return ResponseEntity.ok(this.matchService.getByIdOrThrowBadRequestException(matchId));
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> updateMatch(@RequestBody MatchRequestDTO matchRequestDTO) {
        this.matchService.updateMatch(matchRequestDTO);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{matchId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> deleteMatch(@PathVariable Long matchId) {
        this.matchService.deleteMatch(matchId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/test")
    public String testEndPoint() {
        return "Actuator test";
    }
}
