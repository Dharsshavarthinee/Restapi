package com.example.d8pb2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d8pb2.model.Product;
import com.example.d8pb2.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo pRepo;

    public Product postProduct(Product p)
    {
        return pRepo.save(p);
    }

    public List<String> getNameByStart(String prefix)
    {
        return pRepo.getByNameStartsWith(prefix);
    }

    public List<String> getNameByEnd(String suffix)
    {
        return pRepo.getByNameEndsWith(suffix);
    }

    public List<Product> getSortByPrice()
    {
        return pRepo.getSortByPrice();
    }
}
