package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Product;
import com.example.project.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired 
    ProductRepo pRepo;

    public Product postProduct(Product p)
    {
        return pRepo.save(p);
    }

    public List<Product> getProduct()
    {
        return pRepo.findAll();
    }

    public Product editProduct(Product p,Long productId)
    {
        Product pAvail=pRepo.findById(productId).orElse(null);

        if(pAvail!=null)
        {
            pAvail.setProductCategory(p.getProductCategory());
            pAvail.setProductName(p.getProductName());
            pAvail.setProductDescription(p.getProductDescription());
            pAvail.setProductPrice(p.getProductPrice());

            return pRepo.saveAndFlush(pAvail);
        }
        else{
            return null;
        }
    }

    public List<Product> getProductsByCategory(String productCategory) {
        return pRepo.findByProductCategory(productCategory);
    }

    public String deleteProductByName(String productName) {
        return pRepo.deleteByProductName(productName);
    }
}
