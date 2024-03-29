package com.levi.br.order.exception.item;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponseException;

public class ItemNotFoundException extends ErrorResponseException {
    public ItemNotFoundException(Integer id) {
        super(HttpStatus.NOT_FOUND, asProblemDetail("Item with id " + id + " not found"), null);
    }

    private static ProblemDetail asProblemDetail(final String message) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, message);
        problemDetail.setTitle("Item information is not found");
        return problemDetail;
    }
}
