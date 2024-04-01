package com.levi.br.order.repository;

import com.levi.br.order.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author levi
 */
@Repository
public interface OrderRepository extends JpaRepository<OrderItem, Integer> {
}
