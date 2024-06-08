package com.levi.movieticket.spring_boot_movie_booking_demo.api.dto;

import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.PaymentInfo;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.TicketInfo;

public record MovieTicketRequest(
        TicketInfo ticketInfo,
        PaymentInfo paymentInfo) {
}
