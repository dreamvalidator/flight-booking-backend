package com.ps.flightbooking.entity;
import com.ps.flightbooking.utility.City;
import com.ps.flightbooking.utility.FlightType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.UUID;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private UUID ticketId;

private City arrivalCity;
private City departureCity;
    private BigDecimal ticketPrice;
    private String passengerName;
    private BigInteger mobileNumber;
    private int passengerAge;
    private String passengerEmail;
    private LocalDate journeyDate;


}
