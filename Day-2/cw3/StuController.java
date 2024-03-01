package com.example.day2.cw3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StuController {
    @GetMapping("/student")
    public Stu getMethodName()
    {
        Stu student=new Stu(1L,"John Doe","This is a student description");
        return student;

    }
}
