package com.example.d5pb1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d5pb1.model.Product;
import com.example.d5pb1.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo pRepo;

    @SuppressWarnings("null")
    public Product postProduct(Product p)
    {
        return pRepo.save(p);
    }

    public Product putProduct(int productId,Product product)
    {
        Product productAvail=pRepo.findById(productId).orElse(null);

        if(productAvail!=null)
        {
            productAvail.setProductName(product.getProductName());
            productAvail.setProductId(product.getProductId());
            productAvail.setProductDescription(product.getProductDescription());
            return pRepo.saveAndFlush(productAvail);
        }
        else
        return null;
    }
    
    public boolean delProduct(int id) {
        if(pRepo.existsById(id)) {
           pRepo.deleteById(id);
           return true;
        } else {
           return false;
        }
    }
}
