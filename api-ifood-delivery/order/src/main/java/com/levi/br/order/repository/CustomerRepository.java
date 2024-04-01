package com.levi.br.order.repository;

import com.levi.br.order.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author levi
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
