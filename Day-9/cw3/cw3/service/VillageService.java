package com.example.cw3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cw3.model.Village;
import com.example.cw3.repository.VillageRepo;

import java.util.List;
import java.util.Optional;

@Service
public class VillageService
{
    @Autowired
    VillageRepo villageRepo;
    public Village addRecipes(Village village)
    {
        return villageRepo.save(village);
    }
    public Village getByName(String villageName)
    {
        return villageRepo.findByVillageName(villageName);
    }
    public List<Village> getByPopulation(int population)
    {
        return villageRepo.findByVillagePopulation(population);
    }

    public Optional<Village> getById(int recipeId)
    {
        return villageRepo.findById(recipeId);
    }
}