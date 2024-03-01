package com.example.d4pb4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.d4pb4.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Long> {
    
}
