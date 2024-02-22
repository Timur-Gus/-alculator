package com.calculator.calculator.controller;

import com.calculator.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController() {
        this.calculatorService = new CalculatorService();
    }

    @GetMapping
    public String hello() {
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculatorService.divide(num1, num2);
    }


}
