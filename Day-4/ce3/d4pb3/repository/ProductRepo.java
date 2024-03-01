package com.example.d4pb3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.d4pb3.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
    
}
