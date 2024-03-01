package com.example.d8pb3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.d8pb3.model.Student;
import com.example.d8pb3.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService sService;

    @PostMapping("/student")
    public ResponseEntity <Student> addStudent(@RequestBody Student s)
    {
        return new ResponseEntity<> (sService.postStudent(s),HttpStatus.CREATED);
    }

    @GetMapping("/student/marksGreaterThan/{mark}")
    public List<Student> getGreaterMarks(@PathVariable int mark)
    {
        return sService.getByMarkGreaterThan(mark);
    }

    @GetMapping("/student/marksLessThan/{mark}")
    public List<Student> getLesserMarks(@PathVariable int mark)
    {
        return sService.getByMarkLesserThan(mark);
    }

}
