package com.example.d8pb1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.d8pb1.model.Person;
import com.example.d8pb1.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    PersonService pService;

    @PostMapping("/person")
    public ResponseEntity <Person> postPerson(@RequestBody Person p)
    {
        return new ResponseEntity<>(pService.postPerson(p),HttpStatus.CREATED);
    }

    @GetMapping("/person/startsWithName/{value}")
    public List<Person> getByNameStart(@PathVariable String value)
    {
        return pService.getByNameStartsWith(value);
    }

    @GetMapping("/person/endsWithName/{value}")
    public List<Person> getByNameEnd(@PathVariable String value)
    {
        return pService.getByNameEndsWith(value);
    }
}
