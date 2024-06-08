package com.levi.movieticket.spring_boot_movie_booking_demo.api.dto;

import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.PaymentStatus;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.TicketInfo;

import java.math.BigDecimal;

public record MovieTicketResponse(
        PaymentStatus status,
        BigDecimal totalFare,
        String prnNo,
        TicketInfo ticketInfo
) {
}
