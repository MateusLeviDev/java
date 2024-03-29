package com.levi.br.order.dto;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author levi
 */
public record OrderDetails(
        int orderId,
        int customerId,
        int restaurantId,
        String deliveryAddress,
        BigDecimal billingAmount,
        List<Items> items
) {
}
