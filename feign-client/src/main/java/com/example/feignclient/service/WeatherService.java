package com.example.feignclient.service;


import com.example.feignclient.client.WeatherClient;
import com.example.feignclient.dto.DataRequestDTO;
import com.example.feignclient.dto.DataResponseDTO;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class WeatherService {
    private final WeatherClient weatherClient;

    @Value("${weather.service-key}")
    private String serviceKey;

    public String getWeatherData() {
        DataRequestDTO dataRequestDTO = DataRequestDTO.builder()
                .serviceKey(serviceKey)
                .numOfRows(10)
                .pageNo(1)
                .dataType("JSON")
                .base_date("20250302")
                .base_time("1100")
                .nx(62)
                .ny(126)
                .build();

            log.info("요청 데이터: {}", dataRequestDTO);

            String response = weatherClient.getWeather(
                    dataRequestDTO.getServiceKey(),
                    dataRequestDTO.getNumOfRows(),
                    dataRequestDTO.getPageNo(),
                    dataRequestDTO.getDataType(),
                    dataRequestDTO.getBase_date(),
                    dataRequestDTO.getBase_time(),
                    dataRequestDTO.getNx(),
                    dataRequestDTO.getNy()
            );
        return response;
    }


};
