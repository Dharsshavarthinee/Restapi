package com.example.d7prob1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.d7prob1.model.Person;
import com.example.d7prob1.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/api/person")
    public ResponseEntity<Person> PostPerson(@RequestBody Person p)
    {
        return new ResponseEntity<>(personService.postPerson(p),HttpStatus.CREATED);
    }
    @GetMapping("/api/person")
    public List<Person> GetPerson()
    {
        return personService.getPerson();
    }
    @GetMapping("/api/person/byAge")
   public List<Person> GetPersonById(@RequestParam int age){
    return personService.getByAge(age);
        
    }
}