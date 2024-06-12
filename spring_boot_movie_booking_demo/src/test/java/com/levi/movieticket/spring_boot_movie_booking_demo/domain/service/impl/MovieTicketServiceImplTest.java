package com.levi.movieticket.spring_boot_movie_booking_demo.domain.service.impl;

import com.levi.movieticket.spring_boot_movie_booking_demo.api.dto.MovieTicketRequest;
import com.levi.movieticket.spring_boot_movie_booking_demo.api.dto.MovieTicketResponse;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.PaymentInfo;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.TicketInfo;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.repository.PaymentInfoRepository;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.repository.TicketInfoRepository;
import com.levi.movieticket.spring_boot_movie_booking_demo.util.PaymentInfoCreator;
import com.levi.movieticket.spring_boot_movie_booking_demo.util.TicketInfoCreator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.DataAccessResourceFailureException;

@ExtendWith(MockitoExtension.class)
class MovieTicketServiceImplTest {

    @Mock
    TicketInfoRepository ticketInfoRepository;

    @Mock
    PaymentInfoRepository paymentInfoRepository;

    @InjectMocks
    MovieTicketServiceImpl movieTicketService;

    MovieTicketRequest movieTicketRequest;

    TicketInfo ticketInfo;

    PaymentInfo paymentInfo;

    @BeforeEach
    void init() {
        ticketInfo = TicketInfoCreator.createTicketInfoToBeSaved();
        paymentInfo = PaymentInfoCreator.createPaymentInfoToBeSaved();
        movieTicketRequest = new MovieTicketRequest(ticketInfo, paymentInfo);
    }

    @Test
    void bookMovieTicket_shouldSaveTicketInfoAndPaymentInfo() {
        //given
        when(ticketInfoRepository.save(ticketInfo)).thenReturn(ticketInfo);
        when(paymentInfoRepository.save(paymentInfo)).thenReturn(paymentInfo);

        //when
        final MovieTicketResponse response = movieTicketService.bookMovieTicket(movieTicketRequest);

        //then
        assertNotNull(response);
        verify(ticketInfoRepository, times(1)).save(ticketInfo);
        verify(paymentInfoRepository, times(1)).save(paymentInfo);
    }

    @Test
    void bookMovieTicket_shouldSetPaymentInfoTicketIdAndAmount() {
        // Given
        given(ticketInfoRepository.save(ticketInfo)).willReturn(ticketInfo);
        given(paymentInfoRepository.save(paymentInfo)).willReturn(paymentInfo);

        // When
        movieTicketService.bookMovieTicket(movieTicketRequest);

        // Then
        assertThat(paymentInfo.getTicketId()).isEqualTo(ticketInfo.getId());
        assertThat(paymentInfo.getAmount()).isEqualTo(ticketInfo.getTicketPrize());
    }

    @Test
    void bookMovieTicket_shouldHandleTicketInfoRepositorySaveException() {
        // given
        when(ticketInfoRepository.save(ticketInfo)).thenThrow(new DataAccessResourceFailureException("DB error"));

        // when / then
        assertThrows(RuntimeException.class, () -> {
            movieTicketService.bookMovieTicket(movieTicketRequest);
        });

        verify(paymentInfoRepository, never()).save(paymentInfo);
    }


}