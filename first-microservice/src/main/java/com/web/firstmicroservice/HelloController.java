package com.web.firstmicroservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping
    public String getMessage() {
        return "Hello World";
    }
    
}