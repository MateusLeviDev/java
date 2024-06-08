package com.levi.movieticket.spring_boot_movie_booking_demo.api.dto;

import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.TicketInfo;

public record MovieTicketResponse(
        boolean status,
        double totalFare,
        String prnNo,
        TicketInfo ticketInfo
) {
}
