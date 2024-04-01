package com.levi.br.order.domain;

import com.levi.br.order.dto.OrderResponse;
import com.levi.br.order.dto.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;

/**
 * @author levi
 */
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "delivery_address", nullable = false)
    private String deliveryAddress;

    @Column(name = "order_status", nullable = false)
    private OrderStatus orderStatus;

    @Column(name = "billing_amount")
    private BigDecimal billingAmount;

    public static Optional<OrderResponse> from(Order order) {
        if (Objects.isNull(order)) {
            return Optional.empty();
        }
        return Optional.of(new OrderResponse(order.getId(),
                order.getOrderStatus(), order.getBillingAmount(), Instant.now()));
    }
}
