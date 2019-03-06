package com.planetway.assignment.controller;

import com.planetway.assignment.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculate")
    public BigDecimal calculate(@RequestParam(value = "op") String operation,
                                @RequestParam(value = "num1") BigDecimal num1,
                                @RequestParam(value = "num2") BigDecimal num2) {

        return calculatorService.runCalculator(operation, num1, num2);
    }
}
