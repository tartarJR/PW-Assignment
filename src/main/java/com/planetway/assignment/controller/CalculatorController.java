package com.planetway.assignment.controller;

import com.planetway.assignment.dto.CalculateRequest;
import com.planetway.assignment.dto.CalculateResponse;
import com.planetway.assignment.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculate")
    public CalculateResponse calculate(@RequestParam(value = "op") String operation,
                                       @RequestParam(value = "num1") BigDecimal num1,
                                       @RequestParam(value = "num2") BigDecimal num2) {

        return calculatorService.runCalculator(operation, num1, num2);
    }

    @PostMapping("/calculate")
    public CalculateResponse calculate(@RequestBody CalculateRequest calculateRequest) {

        String operation = calculateRequest.getOperation();
        BigDecimal num1 = calculateRequest.getNum1();
        BigDecimal num2 = calculateRequest.getNum2();

        return calculatorService.runCalculator(operation, num1, num2);
    }
}
