package com.example.feignclient.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataRequestDTO {
    private String serviceKey;
    private int numOfRows;
    private int pageNo;
    private String dataType;
    private String base_date;
    private String base_time;
    private int nx;
    private int ny;
}
