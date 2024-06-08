package com.levi.movieticket.spring_boot_movie_booking_demo.api.controller;

import com.levi.movieticket.spring_boot_movie_booking_demo.api.dto.MovieTicketRequest;
import com.levi.movieticket.spring_boot_movie_booking_demo.api.dto.MovieTicketResponse;
import com.levi.movieticket.spring_boot_movie_booking_demo.domain.service.MovieTicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/movie")
@RequiredArgsConstructor
public class MovieTicketController {

    private final MovieTicketService movieTicketService;

    @PostMapping
    public ResponseEntity<MovieTicketResponse> bookTicket(@RequestBody MovieTicketRequest movieTicketRequest) {
        return new ResponseEntity<>(this.movieTicketService.bookMovieTicket(movieTicketRequest), HttpStatus.CREATED);
    }
}
