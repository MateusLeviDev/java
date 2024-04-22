package com.levi.statsapi.dto.Report;

import com.levi.statsapi.domain.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReportsResponseDTO {

    private Integer matchesWinQuantity;
    private Integer winsQuantity;
    private Integer winsPercentage;
    private Team mostWatchedTeam;
    private Integer daysWithoutWatching;

}
