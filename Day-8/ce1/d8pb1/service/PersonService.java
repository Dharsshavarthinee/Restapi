package com.example.d8pb1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d8pb1.model.Person;
import com.example.d8pb1.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    PersonRepo pRepo;

    public Person postPerson(Person p)
    {
        return pRepo.save(p);
    }

    public List<Person> getByNameStartsWith(String prefix)
    {
        return pRepo.findByNameStartsWith(prefix);
    }

    public List<Person> getByNameEndsWith(String suffix)
    {
        return pRepo.findByNameEndsWith(suffix);
    }
}
