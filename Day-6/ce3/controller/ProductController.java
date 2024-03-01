package com.example.day6_3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day6_3.model.Product;
import com.example.day6_3.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/api/product")
    public Product postProduct(@RequestBody Product p)
    {
        return productService.postProduct(p);
    }
    @GetMapping("/api/product/{offset}/{pagesize}")
    public List<Product> getProductWithPaging(@PathVariable int offset,@PathVariable int pagesize)
    {
        return productService.getProductWithPaging(offset, pagesize);
    }
    @GetMapping("/api/product/{offset}/{pagesize}/{field}")
    public List<Product> getProductWithPagingAndSorting(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
    {
        return productService.getProductWithPagingAndSorting(offset, pagesize, field);
    }
}

