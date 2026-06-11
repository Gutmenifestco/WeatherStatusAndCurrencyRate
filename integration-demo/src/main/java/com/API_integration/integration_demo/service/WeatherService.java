package com.API_integration.integration_demo.service;

import com.API_integration.integration_demo.dto.WeatherResponse;
import com.API_integration.integration_demo.integration.WeatherClient;

public class WeatherService {

    private final WeatherClient weatherClient;

    public WeatherService (WeatherClient weatherClient) {

        this.weatherClient = weatherClient;
    }

    public WeatherResponse getWeather (String city) {

        return weatherClient.fetchWeather(city);
    }
}
