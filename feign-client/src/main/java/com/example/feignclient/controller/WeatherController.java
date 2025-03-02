package com.example.feignclient.controller;

import com.example.feignclient.dto.DataResponseDTO;
import com.example.feignclient.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/data")
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping
    String getWeather() {
        return weatherService.getWeatherData();
    }
}
