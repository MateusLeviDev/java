package com.levi.br.order.dto;

/**
 * @author levi
 */
public enum OrderStatus {
    PENDING,
    PROCESSING,
    APPROVED,
    DELIVERED,
    CANCELLED;

    // We can have some of these classes as part of a shared library, so that these can be reused/referred.

}
