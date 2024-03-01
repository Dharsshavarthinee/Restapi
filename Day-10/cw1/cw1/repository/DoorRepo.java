package com.example.cw12.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.cw12.model.Door;

@Repository
public interface DoorRepo extends JpaRepository<com.example.cw12.model.Door,Integer> {
   


    
    List<Door>findByColor(String color);


    List<Door>findByDoorType(String doorType);

   
    List<Door>findByDoorId(int doorId);

   

   

    
}
