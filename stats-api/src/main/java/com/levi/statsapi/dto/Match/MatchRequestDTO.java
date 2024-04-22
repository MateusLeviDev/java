package com.levi.statsapi.dto.Match;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchRequestDTO {

    private Long id;
    private LocalDate date;
    @NotNull(message = "score team one cannot be null")
    private Integer scoreTeamOne;
    @NotNull(message = "score team two cannot be null")
    private Integer scoreTeamTwo;
    @NotBlank(message = "id must be valid")
    private Long teamOneId;
    @NotBlank(message = "id must be valid")
    private Long teamTwoId;
    @NotBlank(message = "id must be valid")
    private Long supportedTeamId;
}
