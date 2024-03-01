package com.example.d8pb3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.d8pb3.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {

    @Query("select s from Student s where marks>?1")
    List<Student> getByMarkGreater(int marks);

    @Query("select s from Student s where marks<?1")
    List<Student> getByMarkLesser(int marks);

    
}
