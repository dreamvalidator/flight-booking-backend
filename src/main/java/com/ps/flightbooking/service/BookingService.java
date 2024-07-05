package com.ps.flightbooking.service;

import com.ps.flightbooking.dto.BookingDto;
import com.ps.flightbooking.entity.Booking;



import java.util.List;
import  java.util.Optional;
import java.util.UUID;
public interface BookingService {
    public Booking saveTicket(BookingDto ticektDto);

    public Optional<Booking> findBookingByTicketId(UUID  ticketIid);

    public List<Booking> getAllMyTickets();

    public String deleteTicketById(UUID ticketId);
}
