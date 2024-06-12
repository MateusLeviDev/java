package com.levi.movieticket.spring_boot_movie_booking_demo.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponseException;

public class InsufficientBalanceError extends ErrorResponseException {

    public InsufficientBalanceError(final String message) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, asProblemDetail(message), null);
    }

    private static ProblemDetail asProblemDetail(final String message) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR, message);
        problemDetail.setTitle("Payment failed");
        return problemDetail;
    }
}
