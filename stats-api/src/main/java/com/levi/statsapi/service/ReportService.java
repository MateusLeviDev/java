package com.levi.statsapi.service;

import com.levi.statsapi.domain.Team;
import com.levi.statsapi.dto.Report.ReportsResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface ReportService {

    ReportsResponseDTO getAllReports();

    Integer getMatchesQuantity();

    Integer getWinsQuantity();

    int getWinPercentage();

    Team getMostWatchedTeam();

    Integer getDaysWithoutWatching();

}
