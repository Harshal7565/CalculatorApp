package com.project.calculator.controller;

import com.project.calculator.dto.CalculatorRequest;
import com.project.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/calculate")
    public ResponseEntity<Integer> calculate(@RequestBody CalculatorRequest calculatorRequest) {
        return new ResponseEntity<>(calculatorService.calculate(calculatorRequest), HttpStatus.OK);
    }

}
