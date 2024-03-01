package com.example.day3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ApiController {
    @Autowired
    Servicee userService;
    Student newStudent;
    @PostMapping("/student1")
    public Student postStudentDetails(@RequestBody Student student) {
        newStudent=userService.postStudentDetails(student);
        return newStudent;
    }
    @GetMapping("/student1")
    public Student getStudents() {
        return userService.getStudents();
    }
    
    
}
