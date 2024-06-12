package com.levi.movieticket.spring_boot_movie_booking_demo.util;

import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.TicketInfo;

import java.math.BigDecimal;
import java.util.Date;

public class TicketInfoCreator {
    public static TicketInfo createTicketInfoToBeSaved() {
        return TicketInfo.builder()
                .name("John Doe")
                .email("john.doe@example.com")
                .movieName("Inception")
                .movieDate(new Date())
                .movieTime("18:00")
                .ticketPrize(BigDecimal.valueOf(12.50))
                .build();
    }
}
