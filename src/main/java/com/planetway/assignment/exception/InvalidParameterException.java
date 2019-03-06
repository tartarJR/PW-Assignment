package com.planetway.assignment.exception;

public class InvalidParameterException extends RuntimeException {

    public static final String OPERATION_MISSING_MESSAGE = "Please provide the operation.";
    public static final String FIRST_NUM_MISSING_MESSAGE = "Please provide the first number.";
    public static final String SECOND_NUM_MISSING_MESSAGE = "Please provide the second number.";
    public static final String DIVISOR_IS_ZERO_MESSAGE = "The second number 'divisor' cannot be 0.";
    public static final String INVALID_OPERATOR_MESSAGE = "Supported operations are +, -, *, /. Make sure you provided one of them.";

    public InvalidParameterException(String message) {
        super(message);
    }
}
