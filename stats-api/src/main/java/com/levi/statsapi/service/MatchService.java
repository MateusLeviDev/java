package com.levi.statsapi.service;

import com.levi.statsapi.domain.Match;
import com.levi.statsapi.dto.Match.MatchRequestDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MatchService {

    Match getByIdOrThrowBadRequestException(Long matchId);

    List<Match> getAllMatchNonPageable();

    Page<Match> getAllPageable(Pageable pageable);

    Match registerMatch(MatchRequestDTO matchRequestDTO);

    void updateMatch(MatchRequestDTO matchRequestDTO);

    void deleteMatch(Long matchId);

}
