package com.example.day1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class cw1 {
    @GetMapping("/welcome")
    public String getMethodName()
    {
        return ("Welcome Spring Boot!");
    }
}

