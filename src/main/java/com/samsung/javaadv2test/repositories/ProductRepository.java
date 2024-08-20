package com.samsung.javaadv2test.repositories;

import com.samsung.javaadv2test.repositories.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
//    public List<Product> getProductsByCatalog(String catalog);
//
//    public List<Product> findProductsByName(String name);
}
