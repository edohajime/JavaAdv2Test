package com.samsung.javaadv2test.services;

import com.samsung.javaadv2test.repositories.CatalogRepository;
import com.samsung.javaadv2test.repositories.models.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {
    @Autowired
    private CatalogRepository catalogRepo;

    public List<Catalog> getAllCatalogs() {
        return catalogRepo.findAll();
    }
}
