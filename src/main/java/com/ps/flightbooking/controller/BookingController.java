package com.ps.flightbooking.controller;

import com.ps.flightbooking.dto.BookingDto;
import com.ps.flightbooking.entity.Booking;
import com.ps.flightbooking.service.BookingService;
import com.ps.flightbooking.service.impl.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/flight")
public class BookingController {

    @Autowired
    private BookingServiceImpl bookingService;
    @PostMapping("/ticket")
    public Booking generateTicekt(@RequestBody BookingDto bookingDto){

        return bookingService.saveTicket(bookingDto);
    }
    @GetMapping("/all-booking")
    public List<Booking> getAllTicket(){
        return  bookingService.getAllMyTickets();
    }
    @GetMapping("/search-ticket-byid")
    public Optional<Booking> findBookingById(UUID ticketId){
       return bookingService.findBookingByTicketId(ticketId);
    }
    @DeleteMapping("/cancel-ticket-by-id")
    public String deleteBookingById(UUID ticketId){
        return bookingService.deleteTicketById(ticketId);
    }
}
