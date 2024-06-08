package com.levi.movieticket.spring_boot_movie_booking_demo.domain.repository;

import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, UUID> {
}
