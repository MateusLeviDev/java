package com.levi.br.order.service;

import com.levi.br.order.dto.OrderRequest;
import com.levi.br.order.dto.OrderResponse;

import java.util.Optional;

/*
 * @author levi
 */
public interface OrderService {
    Optional<OrderResponse> requestOrder(OrderRequest orderRequest);

}
