package com.example.day6_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6_2.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    
}
