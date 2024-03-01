package com.example.d4pb2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.d4pb2.model.Job;
import com.example.d4pb2.service.JobService;

@RestController
public class JobController {
    @Autowired
    JobService jService;

    @PostMapping("/jobp")
    public Job pJob(@RequestBody Job j)
    {
        return jService.postJob(j);
    }

    @GetMapping("/jobg")
    public List<Job> gJob()
    {
        return jService.getJob();
    }

    @GetMapping("/jobgid/{jobId}")
    public Optional<Job> gJobBYId(@PathVariable Long jobId)
    {
        return jService.getJobById(jobId);
    }
}
