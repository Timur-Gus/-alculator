package com.calculator.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceParameterizedTest {
    private CalculatorService calculatorService;


    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 455, 78.56, 756, 775, 3})
    public void plusParameterizedTest(Double num1) {
        String actual1 = calculatorService.plus(num1, 3.0);
        double result = num1 + 3.0;
        String expected1 = num1 + " + " + 3.0 + " = " + result;
        assertEquals(actual1, expected1);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 455, 78.56, 756, 775, 3})
    public void minusParameterizedTest(Double num1) {
        String actual1 = calculatorService.minus(num1, 3.0);
        double result = num1 - 3.0;
        String expected1 = num1 + " - " + 3.0 + " = " + result;
        assertEquals(actual1, expected1);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 455, 78.56, 756, 775, 3})
    public void multiplyParameterizedTest(Double num1) {
        String actual1 = calculatorService.multiply(num1, 3.0);
        double result = num1 * 3.0;
        String expected1 = num1 + " * " + 3.0 + " = " + result;
        assertEquals(actual1, expected1);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 455, 78.56, 756, 775, 3})
    public void divideParameterizedTest(Double num1) {
        String actual1 = calculatorService.divide(num1, 3.0);
        double result = num1 / 3.0;
        String expected1 = num1 + " / " + 3.0 + " = " + result;
        assertEquals(actual1, expected1);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 455, 78.56, 756, 775, 3})
    public void divideParameterizedTest2(Double num2) {
        String actual1 = calculatorService.divide(3.0, num2);
        double result = 3.0 / num2;
        String expected1 = 3.0 + " / " + num2 + " = " + result;
        assertEquals(actual1, expected1);
    }

}
