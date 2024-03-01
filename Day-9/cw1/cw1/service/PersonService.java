package com.example.cw1.service;

import java.util.Collections;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.cw1.model.Person;
import com.example.cw1.repository.PersonRepo;



@Service
public class PersonService {
    @Autowired
    PersonRepo obj;
    public void postUser(Person person)
    {
       obj.save(person);
    }

    

    public List<Person> getPersonByAge(int age)
    {
        if(obj.count()==0)
        {
            return Collections.emptyList();
        }
        return obj.findByAge(age);
    }
    
}