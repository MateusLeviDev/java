package com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity;

import com.levi.movieticket.spring_boot_movie_booking_demo.api.exception.InsufficientBalanceError;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "payment_info")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PaymentInfo {

    @Id
    private UUID paymentId;
    private String accountNo;
    private double amount;
    private String cardType;
    private Long ticketId;

//    public boolean validateCreditLimit(String accountNo, BigDecimal paidAmount) {
//        Map<String, Double> paymentInfo = new HashMap<>();
//        paymentInfo.put("acc1", 1000.0);
//        paymentInfo.put("acc2", 500.0);
//        paymentInfo.put("acc3", 2000.0);
//
//        if (this.amount > paymentInfo.getOrDefault(accountNo, paidAmount)) {
//            throw new InsufficientBalanceError("Insufficient Balance!!!");
//        }
//    }
}
