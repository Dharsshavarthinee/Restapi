package com.example.d4pb3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d4pb3.model.Product;
import com.example.d4pb3.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo pRepo;

    @SuppressWarnings("null")
    public Product postProduct(Product p)
    {
        return pRepo.save(p);
    }

    public List<Product> getProduct()
    {
        return pRepo.findAll();
    }

    @SuppressWarnings("null")
    public Optional<Product> getProductById(Long productId)
    {
        return pRepo.findById(productId);
    }
}
