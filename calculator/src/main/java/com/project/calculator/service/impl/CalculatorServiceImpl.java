package com.project.calculator.service.impl;

import com.project.calculator.dto.CalculatorRequest;
import com.project.calculator.service.CalculatorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int calculate(CalculatorRequest calculatorRequest) {
        log.info("calculation process starts..");
        try {
            switch (calculatorRequest.getOperation()) {
                case "+":
                    log.info("Addition of " + calculatorRequest.getNumberOne() + " & " + calculatorRequest.getNumberTwo());
                    return calculatorRequest.getNumberOne() + calculatorRequest.getNumberTwo();
                case "-":
                    log.info("Subtraction of " + calculatorRequest.getNumberOne() + " & " + calculatorRequest.getNumberTwo());
                    return calculatorRequest.getNumberOne() - calculatorRequest.getNumberTwo();
                case "*":
                    log.info("Multiplication of " + calculatorRequest.getNumberOne() + " & " + calculatorRequest.getNumberTwo());
                    return calculatorRequest.getNumberOne() * calculatorRequest.getNumberTwo();
                case "/":
                    log.info("Division of " + calculatorRequest.getNumberOne() + " & " + calculatorRequest.getNumberTwo());
                    return calculatorRequest.getNumberOne() / calculatorRequest.getNumberTwo();
                default:
                    log.info("Default operation.");
                    throw new IllegalArgumentException("Illegal Argument Exception occurred.");
            }
        } catch (ArithmeticException e) {
            log.error("Division by zero is not allowed.");
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}
