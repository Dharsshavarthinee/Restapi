package com.example.d5pb2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.d5pb2.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    
}
