package com.example.cw3.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.cw3.model.Village;


@Repository
public interface VillageRepo extends JpaRepository<Village,Integer>
{
    @Modifying
    @Transactional
    

    
    
    List<Village> findByVillagePopulation(int population);
    
    
    Village findByVillageName(String villageName);

    
}