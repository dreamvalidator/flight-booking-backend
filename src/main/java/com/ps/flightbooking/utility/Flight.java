package com.ps.flightbooking.utility;

public enum Flight {

        INDIGO_304("INDIGO-6E", City.MUMBAI, "06.00", City. DELHI, "08.00"),
        INDIGO_320("INDIGO-6E320",City. MUMBAI, "09.00", City. DELHI, "11.00" ),
        INDIGO_321("INDIGO-6E630", City. DELHI, "09.00", City. KOLKATA, "11.00");

        private String flightNumber;

        private City arrivalCity;

        private City departureCity;

        private String arrivalTime;
        private String departureTime;

        Flight(String flightNumber, City departureCity, String departureTime, City arrivalCity, String arrivalTime) {
                this.flightNumber = flightNumber;
                this.departureCity = departureCity;
                this.departureTime = departureTime;
                this.arrivalCity = arrivalCity;
                this.arrivalTime = arrivalTime;
        }



}
