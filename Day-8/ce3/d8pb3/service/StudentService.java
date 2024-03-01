package com.example.d8pb3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d8pb3.model.Student;
import com.example.d8pb3.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    StudentRepo sRepo;


    public Student postStudent(Student s)
    {
        return sRepo.save(s);
    }

    public List<Student> getByMarkLesserThan(int marks)
    {
        return sRepo.getByMarkLesser(marks);
    }

    public List<Student> getByMarkGreaterThan(int marks)
    {
        return sRepo.getByMarkGreater(marks);
    }
}
