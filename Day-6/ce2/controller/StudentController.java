package com.example.day6_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.day6_2.model.Student;
import com.example.day6_2.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/api/student")
    public Student postStudent(@RequestBody Student s)
    {
        return studentService.postStudent(s);
    }
    @GetMapping("/api/student")
    public List<Student> findStudents(@RequestParam int pageNumber,int pageSize)
    {
        return studentService.findStudents(pageNumber, pageSize);
    }
    @GetMapping("/api/student/sort")
    public List<Student> sortStudents(@RequestParam int pageNumber,@RequestParam int pageSize,@RequestParam String field)
    {
        return studentService.getStudentWithSortingAndPaging(pageNumber, pageSize, field);
    }
    
}
