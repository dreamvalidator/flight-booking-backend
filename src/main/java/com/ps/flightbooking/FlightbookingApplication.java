package com.ps.flightbooking;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlightbookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlightbookingApplication.class, args);
    }

    @Bean
    public ModelMapper  modelMapper(){
        return new ModelMapper();
    }
}
