package com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ticket_info")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TicketInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String movieName;
    private Date movieDate;
    private String movieTime;
    private BigDecimal ticketPrize;

}
