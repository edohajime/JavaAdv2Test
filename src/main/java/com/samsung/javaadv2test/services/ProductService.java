package com.samsung.javaadv2test.services;

import com.samsung.javaadv2test.repositories.ProductRepository;
import com.samsung.javaadv2test.repositories.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

//    public List<Product> getProductsByCatalog(String catalogName) {
//        return productRepo.getProductsByCatalog(catalogName);
//    }
//
//    public List<Product> findProductsByName(String name) {
//        return productRepo.findProductsByName(name);
//    }
}
