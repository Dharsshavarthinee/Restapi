package com.example.day2.cw2;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
    @PostMapping("/students")
    public Student getMethodName()
    {
        Student s=new Student("Divya",19);

        return s;
          
    }

}