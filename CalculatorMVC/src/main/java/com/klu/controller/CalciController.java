package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.service.CalciService;

@RestController
@RequestMapping("/calculator")
public class CalciController {

    @Autowired
    private CalciService calciService;

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return calciService.add(a, b);
    }

    @GetMapping("/subtract/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b) {
        return calciService.subtract(a, b);
    }

    @GetMapping("/multiply/{a}/{b}")
    public int multiply(@PathVariable int a, @PathVariable int b) {
        return calciService.multiply(a, b);
    }

    @GetMapping("/division/{a}/{b}")
    public double division(@PathVariable int a, @PathVariable int b) {
        return calciService.division(a, b);
    }
}
