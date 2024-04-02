package com.levi.br.order.service;

import com.levi.br.order.dto.OrderRequest;
import com.levi.br.order.dto.OrderResponse;

import java.util.Optional;

public interface OrderService {
    Optional<OrderResponse> requestOrder(OrderRequest orderRequest);

}
