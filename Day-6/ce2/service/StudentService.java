package com.example.day6_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6_2.model.Student;
import com.example.day6_2.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public Student postStudent(Student s)
    {
        return studentRepo.save(s);
    }
    public List<Student> findStudents(int pageNumber,int pageSize)
    {
        return studentRepo.findAll(PageRequest.of(pageNumber, pageSize)).getContent();
    }
    public List<Student> getStudentWithSortingAndPaging(int pageNumber,int pageSize,String field)
    {
        return studentRepo.findAll(PageRequest.of(pageNumber, pageSize).withSort(Sort.by(Sort.Direction.ASC,field))).getContent();
    }
}
