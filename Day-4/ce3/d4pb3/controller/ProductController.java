package com.example.d4pb3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.d4pb3.model.Product;
import com.example.d4pb3.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService pService;

    @PostMapping("/pProd")
    public Product pProduct(@RequestBody Product p)
    {
        return pService.postProduct(p);
    }

    @GetMapping("/gProd")
    public List<Product> gProduct()
    {
        return pService.getProduct();
    }

    @GetMapping("/gProd/{productId}")
    public Optional<Product> gProductById(@PathVariable Long productId)
    {
        return pService.getProductById(productId);
    }

}
