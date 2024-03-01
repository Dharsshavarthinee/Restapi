package com.example.d4pb1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.d4pb1.model.Medicine;

//extend to access inbuild methods//table created like in Medicine class with a long primary key
@Repository
public interface MedicineRepo extends JpaRepository<Medicine,Long>
{
    
}
