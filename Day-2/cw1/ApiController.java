package com.example.day2.cw1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Value("${app.name}")
    public String appName;
    @Value("${app.version}")
    public String appVersion;
    

    @GetMapping("/info")
    public String getMethodName()
    {
        return ("App Name: "+appName+", Version: "+appVersion);
    }
}
