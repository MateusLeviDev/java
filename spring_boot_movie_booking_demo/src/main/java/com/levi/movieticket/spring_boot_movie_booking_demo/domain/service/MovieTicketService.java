package com.levi.movieticket.spring_boot_movie_booking_demo.domain.service;

import com.levi.movieticket.spring_boot_movie_booking_demo.api.dto.MovieTicketRequest;
import com.levi.movieticket.spring_boot_movie_booking_demo.api.dto.MovieTicketResponse;


public interface MovieTicketService {

    MovieTicketResponse bookMovieTicket(MovieTicketRequest movieTicketRequest);

}
