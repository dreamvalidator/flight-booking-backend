package com.ps.flightbooking.repository;

import com.ps.flightbooking.entity.Booking;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookingRepository extends JpaRepository<Booking, UUID> {
}
