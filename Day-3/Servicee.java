package com.example.day3;

import org.springframework.stereotype.Service;

@Service
public class Servicee {
    Student newStudent;
    public Student postStudentDetails(Student student)
    {
        newStudent=new Student(student.name,student.age);
        return newStudent;
    }
    public Student getStudents()
    {
    return newStudent;
    }
}
