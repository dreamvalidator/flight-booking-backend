package com.ps.flightbooking.utility;

import java.math.BigDecimal;

public enum FlightType {

    ECONOMY(new BigDecimal ("20")),

    LUXURY(new BigDecimal("30")),
    BUSINESS(new BigDecimal("25"));

    private BigDecimal baseFare;
    FlightType(BigDecimal baseFare){
        this.baseFare = baseFare;
    }

    public BigDecimal getBaseFare(){
        return baseFare;
    }
}
