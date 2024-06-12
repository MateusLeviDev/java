package com.levi.movieticket.spring_boot_movie_booking_demo.util;

import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.PaymentInfo;

import java.math.BigDecimal;

public class PaymentInfoCreator {

    public static PaymentInfo createPaymentInfoToBeSaved() {
        return PaymentInfo.builder()
                .accountNo("123456789")
                .amount(BigDecimal.valueOf(12.50))
                .cardType("VISA")
                .ticketId(1L)
                .build();
    }
}
