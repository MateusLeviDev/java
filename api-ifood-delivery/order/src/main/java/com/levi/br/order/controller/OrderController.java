package com.levi.br.order.controller;

import com.levi.br.order.dto.OrderRequest;
import com.levi.br.order.dto.OrderResponse;
import com.levi.br.order.exception.order.OrderCreationException;
import com.levi.br.order.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/*
 * @author levi
 */
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderResponse> requestOrder(@Valid @RequestBody OrderRequest orderRequest) {
        Optional<OrderResponse> optionalOrderResponse = orderService.requestOrder(orderRequest);
        if (optionalOrderResponse.isEmpty())
            throw new OrderCreationException("Empty order is created");

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(optionalOrderResponse.get());
    }
}
