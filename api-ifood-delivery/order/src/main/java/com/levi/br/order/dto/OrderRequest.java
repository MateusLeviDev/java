package com.levi.br.order.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * @author levi
 */
@Validated
public record OrderRequest(
        @Min(1) int restaurantId,
        @Min(1) int customerId,
        @NotBlank String deliveryAddress,
        @Size(min = 1) List<Items> items
) {
}
