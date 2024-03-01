package com.example.d7prob3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d7prob3.model.Door;
import com.example.d7prob3.repository.DoorRepo;

@Service
public class DoorService {
    @Autowired
    DoorRepo dRepo;

    public Door postDoor(Door d)
    {
        return dRepo.save(d);
    }
    public List<Door> getDoor()
    {
        return dRepo.findAll();
    }
    public  Optional<Door> getDoorById(int doorId)
    {
        return dRepo.findById(doorId);
    }
    public List<Door> getDoorByAsscessType(String accessType)
    {
        return dRepo.findByaccessType(accessType);
    }
}