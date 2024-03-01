package com.example.day1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cw3 {
    @GetMapping ("/favouriteColor")
    public String getMethodName(@RequestParam String color)
    {
        return ("My favorite color is "+color+"!");
    }
}