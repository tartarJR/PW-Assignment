package com.planetway.assignment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class CalculateResponse {
    private BigDecimal result;
}
