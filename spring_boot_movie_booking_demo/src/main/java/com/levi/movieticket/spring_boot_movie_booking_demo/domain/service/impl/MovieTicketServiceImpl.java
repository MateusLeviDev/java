package com.levi.movieticket.spring_boot_movie_booking_demo.domain.service.impl;

import com.levi.movieticket.spring_boot_movie_booking_demo.api.dto.MovieTicketRequest;
import com.levi.movieticket.spring_boot_movie_booking_demo.api.dto.MovieTicketResponse;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.PaymentInfo;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.PaymentStatus;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.TicketInfo;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.repository.PaymentInfoRepository;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.repository.TicketInfoRepository;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.service.MovieTicketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class MovieTicketServiceImpl implements MovieTicketService {

    private final TicketInfoRepository ticketInfoRepository;
    private final PaymentInfoRepository paymentInfoRepository;

    @Override
    public MovieTicketResponse bookMovieTicket(MovieTicketRequest movieTicketRequest) {
        TicketInfo ticketInfo = this.ticketInfoRepository.save(movieTicketRequest.ticketInfo());
        PaymentInfo paymentInfo = movieTicketRequest.paymentInfo();
        paymentInfo.setTicketId(ticketInfo.getId());
        paymentInfo.setAmount(ticketInfo.getTicketPrize());
        //Validate Payment Info

        this.paymentInfoRepository.save(paymentInfo);

        return new MovieTicketResponse(
                PaymentStatus.SUCCESS,
                ticketInfo.getTicketPrize(),
                UUID.randomUUID().toString().split("-")[0],
                ticketInfo
        );
    }
}
