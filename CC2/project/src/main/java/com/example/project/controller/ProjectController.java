package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Product;
import com.example.project.model.User;
import com.example.project.service.ProductService;
import com.example.project.service.UserService;

@RestController
public class ProjectController {
    @Autowired
    UserService uService;

    @Autowired
    ProductService pService;

    @PostMapping("/postUser")
    public User addUser(@RequestBody User u)
    {
        return uService.postUser(u);
    }

    @GetMapping("/getUser")
    public List<User> getUser()
    {
        return uService.getUser();
    }

    @PutMapping("/editUser/{userId}")
    public User editUser(@RequestBody User u,@PathVariable Long userId)
    {
        return uService.editUser(u, userId);
    }

 
    @DeleteMapping("/delUser/{userId}")
    public String delUser(@PathVariable Long userId)
    {
        
        return uService.delUserById(userId);

    }

    @GetMapping("/getUbyEmail/{email}")
    public User getUbyEmail(@PathVariable String email)
    {
        return uService.getUserByEmail(email);
    }

    //////////////////////////////////


    @PostMapping("/postProduct")
    public Product addProduct(@RequestBody Product p)
    {
        return pService.postProduct(p);
    }

    @GetMapping("/getProduct")
    public List<Product> getProduct()
    {
        return pService.getProduct();
    }

    @PutMapping("/editProduct/{productId}")
    public Product editP(@RequestBody Product p,@PathVariable Long productId)
    {
        return pService.editProduct(p, productId);
    }

    
    @GetMapping("/getAllByName/{productName}")
    public List<Product> getProductsByName(@PathVariable String productName) {
        return pService.getProductsByName(productName);
    }

    @GetMapping("/getProd/sort")
    public List<Product> sortStudents(@RequestParam int pageNumber,@RequestParam int pageSize,@RequestParam String field)
    {
        return pService.getProductsWithSortingAndPaging(pageNumber, pageSize, field);
    }
}
