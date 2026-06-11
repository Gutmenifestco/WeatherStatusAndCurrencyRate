package com.API_integration.integration_demo.integration;

import com.API_integration.integration_demo.dto.WeatherResponse;
import org.springframework.web.reactive.function.client.WebClient;

public class WeatherClient {

    private final WebClient webClient;

    public WeatherClient (WebClient.Builder builder) {
        this.webClient = builder.baseUrl("https://api.openweathermap.org/data/2.5").build();
    }

    public WeatherResponse fetchWeather (String city) {

        return webClient.get()
                .uri("/weather?q=" + city + "&appid=YOUR_API_KEY&units=metric")
                .retrieve()
                .bodyToMono (WeatherResponse.class)
                .block();
    }
}
