package com.ps.flightbooking.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
public class CorsConfiguration {
    @Value("${cors.allowed.origins}")
    private String[] allowedOrigins;

    @Bean
    public WebMvcConfigurer cosrsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                if(Arrays.asList(allowedOrigins).contains("*")) {
                    registry.addMapping("/api/**")
                            .allowedOriginPatterns("*")
                            .allowedMethods("GET", "POST", "PUT", "DELETE")
                            .allowedHeaders("*")
                            .allowCredentials(true);
                }
                else {
                    registry.addMapping("/api/**")
                            .allowedOrigins(allowedOrigins)
                            .allowedMethods("GET", "POST", "PUT", "DELETE")
                            .allowedHeaders("*")
                            .allowCredentials(true);
                }
            }
        };
    }
}
