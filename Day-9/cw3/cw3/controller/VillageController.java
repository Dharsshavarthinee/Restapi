package com.example.cw3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.cw3.model.Village;
import com.example.cw3.service.VillageService;




@RestController
public class VillageController
{
@Autowired
VillageService recipeService;
@PostMapping("/api/village")
public ResponseEntity<?> addRecipes(@RequestBody Village village)
{
    
    return ResponseEntity.status(201).body(recipeService.addRecipes(village));
}
@GetMapping("/api/village/byname/{villageName}")
public ResponseEntity<?> getRecipeByName(@PathVariable String villageName)
{
    try{
        return ResponseEntity.status(200).body(recipeService.getByName(villageName));
    }
    catch(Exception e)
    {
        return ResponseEntity.status(500).build();
    }
}
@GetMapping("/api/village/{villageId}")
public ResponseEntity<?> getRecipeById(@PathVariable int villageId)
{
    try{
        return ResponseEntity.status(200).body(recipeService.getById(villageId));
    }
    catch(Exception e)
    {
        return ResponseEntity.status(404).build();
    }
}
@GetMapping("/api/village/bypopulation/{villagePopulation}")
public ResponseEntity<?> getVillageByPopulation(@PathVariable int villagePopulation)
{
    try{
        return ResponseEntity.status(200).body(recipeService.getByPopulation(villagePopulation));
    }
    catch(Exception e)
    {
        return ResponseEntity.status(500).build();
    }
}


}
