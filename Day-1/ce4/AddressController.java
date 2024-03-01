package com.example.day1.cw4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AddressController {
    @GetMapping("/address")
    public Address getMethodName()
    {
        Address address=new Address("Arun",123,"Main St",637220,"Cbe","Cbe","Tn","Ind");
        return address;
    }
}