package com.levi.br.order.repository;

import com.levi.br.order.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author levi
 */
@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer> {

    Optional<Item> findPriceById(Integer itemId);

}
