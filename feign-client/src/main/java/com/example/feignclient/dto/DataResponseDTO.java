package com.example.feignclient.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataResponseDTO {
    private int numOfRows;
    private int pageNo;
    private int totalCount;
    private int resultCode;
    private String resultMsg;
    private String dataType;
    private String base_date;
    private String base_time;
    private int nx;
    private int ny;
    private String category;
    private String obsrValue;
}
