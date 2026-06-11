package com.API_integration.integration_demo.controller;

import com.API_integration.integration_demo.dto.WeatherResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/weather/test")
    public WeatherResponse testWeather() {
        return new WeatherResponse("Yangon", "Sunny", 32.5);
    }
}
