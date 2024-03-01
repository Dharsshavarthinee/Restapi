package com.example.d5pb1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.d5pb1.model.Product;
import com.example.d5pb1.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService pService;

    @PostMapping("/pProd")
    public ResponseEntity <Product> pProduct(@RequestBody Product p)
    {
        return new ResponseEntity<>( pService.postProduct(p),HttpStatus.CREATED);
    }

    @PutMapping("/putProd/{productId}")
    public ResponseEntity<?> editProduct(@PathVariable int productId,@RequestBody Product p) 
    {
        try{
   
             return ResponseEntity.status(200).body(pService.putProduct(productId,p));
        }
        catch(Exception e)
        {
             return ResponseEntity.status(404).build();
        }
    }
   

    @DeleteMapping("/delProd/{productId}")
    public ResponseEntity<?> editProduct(@PathVariable int productId) 
    {
         try{
   
             return ResponseEntity.status(200).body(pService.delProduct(productId));
        }
        catch(Exception e)
        {
             return ResponseEntity.status(404).build();
        }
    }
}
