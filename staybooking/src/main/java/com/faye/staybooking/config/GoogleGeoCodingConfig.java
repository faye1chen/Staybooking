package com.faye.staybooking.config;

import com.google.maps.GeoApiContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GoogleGeoCodingConfig {

    @Value("${geocoding.apikey}")
    private String apiKey;

    @Bean
    public GeoApiContext geoApiContext() {
        GeoApiContext context =  new GeoApiContext.Builder().
                apiKey(apiKey).
                build();

        return context;
    }
}