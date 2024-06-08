package com.levi.movieticket.spring_boot_movie_booking_demo.domain.repository;

import com.levi.movieticket.spring_boot_movie_booking_demo.domain.entity.TicketInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketInfoRepository extends JpaRepository<TicketInfo, Long> {
}
