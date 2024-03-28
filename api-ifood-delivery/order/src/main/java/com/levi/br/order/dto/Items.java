package com.levi.br.order.dto;

/**
 * @author levi
 */
public record Items(
        int itemId,
        int quantity,
        String notes
) {
}
