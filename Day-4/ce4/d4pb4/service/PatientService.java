package com.example.d4pb4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d4pb4.model.Patient;
import com.example.d4pb4.repository.PatientRepo;

@Service
public class PatientService {
    @Autowired
    PatientRepo pRepo;

    @SuppressWarnings("null")
    public Patient postPatient(Patient p)
    {
        return pRepo.save(p);
    }
    
    public List<Patient> getPatient()
    {
        return pRepo.findAll();
    }
    
    @SuppressWarnings("null")
    public Optional<Patient> getPatientById(Long patientId)
    {
        return pRepo.findById(patientId);
    }
}
