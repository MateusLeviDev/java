package com.levi.br.order.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

/**
 * @author levi
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "items")
public class Item {

    @Id
    @Column(name = "item_id")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;
}
