package com.example.day6_3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6_3.model.Product;
import com.example.day6_3.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public Product postProduct(Product p)
    {
        return productRepo.save(p);
    }
    public List<Product> getProductWithPaging(int offset,int pagesize)
    {
        return productRepo.findAll(PageRequest.of(offset, pagesize)).getContent();
    }
    public List<Product> getProductWithPagingAndSorting(int offset,int pagesize,String field)
    {
        return productRepo.findAll(PageRequest.of(offset,pagesize).withSort(Sort.by(Sort.Direction.ASC,field))).getContent();
    }
    public Optional<Product> getByProductId(int productId)
    {
        return productRepo.findById(productId);
    }
}
