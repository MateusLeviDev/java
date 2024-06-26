package com.levi.br.order.exception.customer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponseException;

/**
 * @author levi
 */
public class CustomerNotFoundException extends ErrorResponseException {

    public CustomerNotFoundException(Integer id) {
        super(HttpStatus.NOT_FOUND, asProblemDetail("customer with id " + id + " not found"), null);
    }

    private static ProblemDetail asProblemDetail(final String message) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, message);
        problemDetail.setTitle("Customer information is not found");
        return problemDetail;
    }

}