package com.example.d4pb4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.d4pb4.model.Patient;
import com.example.d4pb4.service.PatientService;

@RestController
public class PatientController {
    @Autowired
    PatientService pService;

    @PostMapping("/pPat")
    public Patient pPatient(@RequestBody Patient p)
    {
        return pService.postPatient(p);
    }

    @GetMapping("/gPat")
    public List<Patient> gPatient()
    {
        return pService.getPatient();
    }

    @GetMapping("/gPat/{patientId}")
    public Optional<Patient> gPatientById(@PathVariable Long patientId)
    {
        return pService.getPatientById(patientId);
    }
}
