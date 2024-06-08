package com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity;

import com.levi.movieticket.spring_boot_movie_booking_demo.api.exception.InsufficientBalanceError;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "payment_info")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PaymentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountNo;
    private BigDecimal amount;
    private String cardType;
    private Long ticketId;

}
