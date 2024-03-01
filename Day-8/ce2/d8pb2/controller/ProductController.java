package com.example.d8pb2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.d8pb2.model.Product;
import com.example.d8pb2.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService pService;

    @PostMapping("/product")
    public ResponseEntity <Product> addProduct(@RequestBody Product p)
    {
        return new ResponseEntity<> (pService.postProduct(p),HttpStatus.CREATED);
    }

    @GetMapping("/product/distinct/startwith/{name}")
    public List<String> getByNameStart(@PathVariable String name)
    {
        return pService.getNameByStart(name);
    }

    @GetMapping("/product/distinct/endwith/{name}")
    public List<String> getByNameEnd(@PathVariable String name)
    {
        return pService.getNameByEnd(name);
    }

    @GetMapping("/product/sortBy/price")
    public List<Product> getSortByProd()
    {
        return pService.getSortByPrice();
    }

}
