package com.levi.br.order.exception.order;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponseException;

public class OrderNotFoundException extends ErrorResponseException {
    public OrderNotFoundException(Integer id) {
        super(HttpStatus.NOT_FOUND, asProblemDetail("Order with id " + id + " not found"), null);
    }

    private static ProblemDetail asProblemDetail(final String message) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, message);
        problemDetail.setTitle("Order information is not found");
        return problemDetail;
    }
}
