package com.example.d7prob2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.d7prob2.model.Course;
import com.example.d7prob2.service.CourseService;

@RestController
public class CourseController {
    
    @Autowired
    CourseService cService;

    @PostMapping("/api/course")
    public ResponseEntity<Course> PostCourse(@RequestBody Course c)
    {
        return new ResponseEntity<>(cService.postCourse(c),HttpStatus.CREATED);
    }

    @GetMapping("/api/course")
    public List<Course> Getourse()
    {
        return cService.getCourse();
    }
    
    @GetMapping("/api/course/{courseName}")
    public List<Course> GetCourseByName(@PathVariable String courseName){
        return cService.getCourseByCourseName(courseName);
    }
}