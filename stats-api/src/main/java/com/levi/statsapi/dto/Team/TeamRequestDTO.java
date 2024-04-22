package com.levi.statsapi.dto.Team;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamRequestDTO {

    private Long id;
    @NotEmpty(message = "name cannot be null or empty")
    private String name;
    @NotEmpty(message = "name cannot be null or empty")
    private String state;
    private String photoUrl;

}
