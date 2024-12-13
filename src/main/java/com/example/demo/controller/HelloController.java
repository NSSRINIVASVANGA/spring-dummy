package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/nataraja")
    public String nataraja() {
        return "Nataraja";
    }
    
    @GetMapping("/srinivas")
    public String srinivas() {
        return "Srinivas";
    }
    
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
    
}
