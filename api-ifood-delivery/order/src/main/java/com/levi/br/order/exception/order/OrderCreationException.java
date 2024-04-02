package com.levi.br.order.exception.order;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponseException;

/*
 * @author levi
 */
public class OrderCreationException extends ErrorResponseException {
    public OrderCreationException(final String message) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, asProblemDetail(message), null);
    }

    private static ProblemDetail asProblemDetail(final String message) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR, message);
        problemDetail.setTitle("Order creation failed");
        return problemDetail;
    }
}
