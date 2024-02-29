package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
            pAvail.setProductName(p.getProductName());
            pAvail.setProductDescription(p.getProductDescription());
            pAvail.setProductPrice(p.getProductPrice());
            pAvail.setCategory(p.getCategory());

            return pRepo.saveAndFlush(pAvail);
        }
        else{
            return null;
        }
    }

    public List<Product> getProductsByName(String productName) {
        return pRepo.findByProductName(productName);
    }

    
    public List<Product> getProductsWithSortingAndPaging(int pageNumber,int pageSize,String field)
    {
        return pRepo.findAll(PageRequest.of(pageNumber, pageSize).withSort(Sort.by(Sort.Direction.ASC,field))).getContent();
    }
}
