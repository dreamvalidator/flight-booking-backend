package com.ps.flightbooking.service.impl;

import com.ps.flightbooking.dto.BookingDto;
import com.ps.flightbooking.entity.Booking;
import com.ps.flightbooking.repository.BookingRepository;
import com.ps.flightbooking.service.BookingService;
import com.ps.flightbooking.utility.FlightType;
import com.ps.flightbooking.utility.TicektCalculator;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import  java.util.Optional;
import java.util.UUID;
@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking saveTicket(BookingDto ticketDto) {
        LocalDate journeyDate = ticketDto.getJourneyDate();
        if (journeyDate.isBefore(LocalDate.now()) || journeyDate.isAfter(LocalDate.now().plusDays(124))) {
            throw new IllegalArgumentException("you cant fly in past days or date is beyond booking days limit");
        }
        FlightType flightType = ticketDto.getFlightType();
        BigDecimal ticketPrice = TicektCalculator.calculatePrice(ticketDto.getArrivalCity(), ticketDto.getDepartureCity(), flightType);

        Booking mapBooking = modelMapper.map(ticketDto, Booking.class);
        mapBooking.setTicketPrice(ticketPrice);
        return bookingRepository.save(mapBooking);

    }

    @Override
    public Optional<Booking> findBookingByTicketId(UUID ticketIid) {
        return bookingRepository.findById(ticketIid);
    }

    @Override
    public List<Booking> getAllMyTickets() {
        LocalDate currentDate = LocalDate.now();
        List<Booking> bookingList = bookingRepository.findAll();
        List<Booking> allBooking = bookingList.stream().filter(e -> e.getJourneyDate().isAfter(currentDate) || e.getJourneyDate().isEqual(currentDate)).toList();
        return allBooking;

    }

    @Override
    public String deleteTicketById(UUID ticketId) {
        Booking booking = bookingRepository.findById(ticketId).orElse(null);
        if (booking != null) {
            return "Ticket deleted successfully";
        } else {
            return "booking not found";
        }

    }
}
