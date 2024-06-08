package com.levi.movieticket.spring_boot_movie_booking_demo.domain.service.impl;

import com.levi.movieticket.spring_boot_movie_booking_demo.api.dto.MovieTicketRequest;
import com.levi.movieticket.spring_boot_movie_booking_demo.api.dto.MovieTicketResponse;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.PaymentInfo;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.TicketInfo;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.repository.PaymentInfoRepository;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.repository.TicketInfoRepository;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.service.MovieTicketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class MovieTicketServiceImpl implements MovieTicketService {

    private final TicketInfoRepository ticketInfoRepository;
    private final PaymentInfoRepository paymentInfoRepository;

    @Override
    public MovieTicketResponse bookMovieTicket(MovieTicketRequest movieTicketRequest) {
//        TicketInfo ticketInfo = this.ticketInfoRepository.save(movieTicketRequest.ticketInfo());
//        var paymentInfo = movieTicketRequest.paymentInfo();
//        paymentInfo.validateCreditLimit();
        return null;
    }
}
