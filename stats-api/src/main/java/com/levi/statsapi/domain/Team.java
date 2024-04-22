package com.levi.statsapi.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RestController
@Builder
@Entity(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 2, nullable = false)
    private String state;

    @Column(name = "photo_url", length = 1024)
    private String photoUrl;

}
