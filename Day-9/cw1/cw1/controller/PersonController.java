package com.example.cw1.controller;


import org.springframework.web.bind.annotation.RestController;

import com.example.cw1.model.Person;
import com.example.cw1.service.PersonService;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
// @RequestMapping("/api/person")
public class PersonController {
    @Autowired
    PersonService obj;
    

    @GetMapping("/api/person/byage/{age}")
    public ResponseEntity<List<Person>> getMethodName(@PathVariable int age) {
        try {
            return new ResponseEntity<>(obj.getPersonByAge(age),HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/api/person")
    public ResponseEntity<Person> postMethod(@RequestBody Person person)
    {
        System.out.print(person.getFirstName());
        try {
            obj.postUser(person);
            return new ResponseEntity<>(person,HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }