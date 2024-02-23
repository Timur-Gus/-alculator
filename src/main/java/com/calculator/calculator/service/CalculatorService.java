package com.calculator.calculator.service;

import com.calculator.calculator.myException.ValueNotFoundException;
import com.calculator.calculator.myInterface.calculatorInterface;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements calculatorInterface {
    @Override
    public Double plus(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new ValueNotFoundException();
        }
        return num1 + num2;
    }

    @Override
    public Double minus(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new ValueNotFoundException();
        }
        return num1 - num2;
    }

    @Override
    public Double multiply(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new ValueNotFoundException();
        }
        return num1 * num2;
    }

    @Override
    public Double divide(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new ValueNotFoundException();
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return num1 / num2;
    }
}
