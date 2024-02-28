package com.calculator.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
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
        Double actual = calculatorService.plus(num1, 3.0);
        Double expected = num1 + 3.0;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 455, 78.56, 756, 775, 3})
    public void minusParameterizedTest(Double num1) {
        Double actual = calculatorService.minus(num1, 3.0);
        Double expected = num1 - 3.0;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 455, 78.56, 756, 775, 3})
    public void multiplyParameterizedTest(Double num1) {
        Double actual = calculatorService.multiply(num1, 3.0);
        Double expected = num1 * 3.0;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 455, 78.56, 756, 775, 3})
    public void divideParameterizedTest(Double num1) {
        Double actual = calculatorService.divide(num1, 3.0);
        Double expected = num1 / 3.0;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 455, 78.56, 756, 775, 3})
    public void divideParameterizedTest2(Double num2) {
        Double actual = calculatorService.divide(3.0, num2);
        Double expected = 3.0 / num2;
        assertEquals(actual, expected);
    }

}
