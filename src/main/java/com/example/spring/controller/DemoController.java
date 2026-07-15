package com.example.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ci/v1/welcome")
public class DemoController {

    @GetMapping
    public String welcome(){
        return "Welcome to the CI/CD leaning";
    }
}
