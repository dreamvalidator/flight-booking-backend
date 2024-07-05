package com.ps.flightbooking.dto;

import com.ps.flightbooking.utility.City;
import com.ps.flightbooking.utility.FlightType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {
    private City arrivalCity;

    private City departureCity;
    private FlightType flightType;
    private BigDecimal ticketPrice;
    private String passengerName;
    private BigInteger mobileNumber;
    private int passengerAge;
    private String passengerEmail;
    private LocalDate journeyDate;
}
