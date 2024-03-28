package com.levi.br.order.dto;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * @author levi
 */
public record OrderResponse(
        int orderId,
        OrderStatus orderStatus,
        BigDecimal billingAmount,
        Instant timeStamp
) {
}
