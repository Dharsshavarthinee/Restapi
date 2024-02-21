package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
    default String deleteByProductName(String productName) {
        if (existsByProductName(productName)) {
            deleteByProductName(productName);
            return "Product '" + productName + "' deleted successfully";
        } else {
            return "Product '" + productName + "' not found";
        }
    }
    
    boolean existsByProductName(String productName);

    List<Product> findByProductCategory(String productCategory);
}
