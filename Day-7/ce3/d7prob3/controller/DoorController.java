package com.example.d7prob3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.d7prob3.model.Door;
import com.example.d7prob3.service.DoorService;

@RestController
public class DoorController {
    @Autowired
    DoorService dService;

    @PostMapping("/api/door")
    public ResponseEntity<Door> PostDoor(@RequestBody Door d)
    {
        return new ResponseEntity<>(dService.postDoor(d),HttpStatus.CREATED);
    }
    @GetMapping("/api/door")
    public List<Door> GetDoor()
    {
        return dService.getDoor();
    }
    @GetMapping("/api/door/{doorId}")
    public Optional<Door> GetDoorById(@PathVariable int doorId){
        return dService.getDoorById(doorId);
    
    }
    @GetMapping("/api/door/accesstype/{accessType}")
    public List<Door> GetDoorByAccessType(@PathVariable String accessType)
    {
        return dService.getDoorByAsscessType(accessType);
    }
}