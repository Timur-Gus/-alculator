package com.calculator.calculator.service;

import com.calculator.calculator.myException.ValueNotFoundException;
import com.calculator.calculator.myInterface.calculatorInterface;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements calculatorInterface {
    @Override
    public String plus(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new ValueNotFoundException();
        }
        Double result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new ValueNotFoundException();
        }
        Double result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String multiply(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new ValueNotFoundException();
        }
        Double result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(Double num1, Double num2) {
        Double result;
        if (num1 == null || num2 == null) {
            throw new ValueNotFoundException();
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
