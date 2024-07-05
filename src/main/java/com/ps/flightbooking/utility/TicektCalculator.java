package com.ps.flightbooking.utility;

import java.math.BigDecimal;

public class TicektCalculator {
    private static final BigDecimal TAXES = new BigDecimal("500.00");

    public static BigDecimal calculatePrice(City arrivalCity, City departureCity ,FlightType flightType) {
        String cityPair= arrivalCity.name() + "-" + departureCity.name();
        Integer distnce=Distance.CITY_PAIRS.get(cityPair);
        if(distnce==null){
            throw new IllegalArgumentException("Invalid city pair");
        }

        BigDecimal distanceDecimal=new BigDecimal(distnce);
        BigDecimal price=distanceDecimal.multiply(flightType.getBaseFare().add(TAXES));
        return price;
    }
}
