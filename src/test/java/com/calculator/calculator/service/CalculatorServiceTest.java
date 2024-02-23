package com.calculator.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CalculatorServiceTest {
    private CalculatorService calculatorService;


    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void plusTest() {
        Double actual1 = calculatorService.plus(10.0, 5.0);
        Double actual2 = calculatorService.plus(15.0, 0.0);
        Double expected1 = 10.0 + 5.0;
        Double expected2 = 15.0 + 0.0;
        assertEquals(actual1, expected1);
        assertEquals(actual2, expected2);
    }
    @Test
    public void minusTest() {
        Double actual1 =   calculatorService.minus(10.0, 5.0);
        Double actual2 =   calculatorService.minus(20.0, 35.0);
        Double expected1 = 10.0 - 5.0;
        Double expected2 = 20.0 - 35.0;
        assertEquals(actual1, expected1);
        assertEquals(actual2, expected2);
    }
    @Test
    public void multiplyTest() {
        Double actual1 =  calculatorService.multiply(10.0, 5.0);
        Double actual2 =  calculatorService.multiply(20.0, 3.0);
        Double expected1 = 10.0 * 5.0;
        Double expected2 = 20.0 * 3.0;
        assertEquals(actual1, expected1);
        assertEquals(actual2, expected2);
    }
    @Test
    public void divideTest() {
        Double actual1 =  calculatorService.divide(10.0, 5.0);
        Double actual2 =  calculatorService.divide(400.0, 100.0);
        Double expected1 = 10.0 / 5.0;
        Double expected2 = 400.0 / 100.0;
        assertEquals(actual1, expected1);
        assertEquals(actual2, expected2);
    }

    @Test
    public void divideArithmeticExTest() throws IllegalArgumentException{
        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(10.0, 0.0);
        });
        assertNotNull(thrown.getMessage());
    }
    }