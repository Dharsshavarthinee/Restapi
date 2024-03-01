package com.example.d7prob1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d7prob1.model.Person;
import com.example.d7prob1.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    PersonRepo personRepo;

    public Person postPerson(Person p)
    {
        return personRepo.save(p);
    }
    public List<Person> getPerson()
    {
        return personRepo.findAll();
    }
    public List<Person> getByAge(int age)
    {
        return personRepo.findByAge(age);
    }
}