package com.example.d8pb2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.d8pb2.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    
    @Query("select distinct p.productName from Product p where p.productName like ?1%")
    List<String> getByNameStartsWith(String prefix);
    
    @Query("select distinct p.productName from Product p where p.productName like %?1")
    List<String> getByNameEndsWith(String suffix);
    
    @Query("select p from Product p order by p.price")
    List<Product> getSortByPrice();
}
