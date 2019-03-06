package com.planetway.assignment.service;

import com.planetway.assignment.exception.InvalidParameterException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

@Service
public class CalculatorService {

    private static final String SUMMATION_OPERATION = "sum";
    private static final String SUBTRACTION_OPERATION = "sub";
    private static final String MULTIPLICATION_OPERATION = "mult";
    private static final String DIVISION_OPERATION = "div";

    private String[] OPS_ARRAY = {SUMMATION_OPERATION, SUBTRACTION_OPERATION, MULTIPLICATION_OPERATION, DIVISION_OPERATION};

    public BigDecimal runCalculator(String operation, BigDecimal num1, BigDecimal num2) {
        // TODO find a better practice for input validation and a more efficient way than using if/else blocks
        if (operation == null) {
            throw new InvalidParameterException(InvalidParameterException.OPERATION_MISSING_MESSAGE);
        } else if (!Arrays.asList(OPS_ARRAY).contains(operation)) {
            throw new InvalidParameterException(InvalidParameterException.INVALID_OPERATOR_MESSAGE);
        } else if (num1 == null) {
            throw new InvalidParameterException(InvalidParameterException.FIRST_NUM_MISSING_MESSAGE);
        } else if (num2 == null) {
            throw new InvalidParameterException(InvalidParameterException.SECOND_NUM_MISSING_MESSAGE);
        } else if (operation.equals(DIVISION_OPERATION) && BigDecimal.ZERO.compareTo(num2) == 0) {
            throw new InvalidParameterException(InvalidParameterException.DIVISOR_IS_ZERO_MESSAGE);
        } else {
            return calculate(operation, num1, num2);
        }
    }

    private BigDecimal calculate(String operation, BigDecimal num1, BigDecimal num2) {

        BigDecimal result = null;

        switch (operation) {
            case SUMMATION_OPERATION:
                result = num1.add(num2);
                break;
            case SUBTRACTION_OPERATION:
                result = num1.subtract(num2);
                break;
            case MULTIPLICATION_OPERATION:
                result = num1.multiply(num2);
                break;
            case DIVISION_OPERATION:
                result = num1.divide(num2, 2, RoundingMode.CEILING);
                break;
        }

        return result != null ? result.setScale(2, RoundingMode.CEILING) : null;
    }

}
