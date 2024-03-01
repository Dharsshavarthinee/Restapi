package com.example.d7prob1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.d7prob1.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer> {
    public List<Person> findByAge(int age);
}