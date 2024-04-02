package com.levi.br.order.service.impl;

import com.levi.br.order.domain.*;
import com.levi.br.order.dto.*;
import com.levi.br.order.exception.customer.*;
import com.levi.br.order.exception.item.*;
import com.levi.br.order.exception.order.*;
import com.levi.br.order.repository.*;
import com.levi.br.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/*
 * @author levi
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final ItemsRepository itemsRepository;
    private final CustomerRepository customerRepository;
    private final OrderItemRepository orderItemRepository;

    @Override
    public Optional<OrderResponse> requestOrder(OrderRequest orderRequest) {
        try {
            int customerId = orderRequest.customerId();
            log.debug("customer id: " + customerId);
            var customerOptional = customerRepository.findById(customerId);
            if (customerOptional.isEmpty())
                throw new CustomerNotFoundException(customerId);

            Order order = orderRepository.save(
                    Order
                            .builder()
                            .id(customerId)
                            .orderStatus(OrderStatus.PENDING)
                            .deliveryAddress(orderRequest.deliveryAddress())
                            .build()
            );

            var orderItemList = orderRequest.items().stream()
                    .map(i -> OrderItem.from(i, order.getId())).toList();

            orderItemRepository.saveAll(orderItemList);
            order.setBillingAmount(calculateBill(orderRequest.items()));
            order.setOrderStatus(OrderStatus.PROCESSING);
            orderRepository.save(order);
            return Order.from(order);
        } catch (Exception e) {
            log.error("issue with creating the order ", e);
            throw new OrderCreationException("issue with creating the order. message : " + e.getMessage());
        }
    }

    private BigDecimal calculateBill(List<Items> items) {
        BigDecimal bill = BigDecimal.ZERO;
        for (Items item : items) {
            Optional<Item> optionalItem = itemsRepository.findPriceById(item.itemId());
            if (optionalItem.isEmpty())
                throw new ItemNotFoundException(item.itemId());

            bill = bill.add(optionalItem.get().getPrice().multiply(BigDecimal.valueOf(item.quantity())));

        }
        return bill;
    }
}
