package com.example.d4pb2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d4pb2.model.Job;
import com.example.d4pb2.repository.JobRepo;

@Service
public class JobService {
    @Autowired
    JobRepo jRepo;

    @SuppressWarnings("null")
    public Job postJob(Job j)
    {
        return jRepo.save(j);
    }

    public List<Job> getJob()
    {
        return jRepo.findAll();
    }

    @SuppressWarnings("null")
    public Optional<Job> getJobById(Long jobId)
    {
        return jRepo.findById(jobId);
    }
}
