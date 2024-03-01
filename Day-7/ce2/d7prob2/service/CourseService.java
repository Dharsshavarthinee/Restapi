package com.example.d7prob2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d7prob2.model.Course;
import com.example.d7prob2.repository.CourseRepo;

@Service
public class CourseService {
    
    @Autowired
    CourseRepo cRepo;

    public Course postCourse(Course c)
    {
        return cRepo.save(c);
    }

    public List<Course> getCourse()
    {
        return cRepo.findAll();
    }
    
    public List<Course> getCourseByCourseName(String courseName)
    {
        return cRepo.findByCourseName(courseName);
    }
}