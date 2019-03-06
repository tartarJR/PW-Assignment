package com.planetway.assignment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CalculateRequest {
    @JsonProperty("op")
    private String operation;
    @JsonProperty("num1")
    private BigDecimal num1;
    @JsonProperty("num2")
    private BigDecimal num2;
}
