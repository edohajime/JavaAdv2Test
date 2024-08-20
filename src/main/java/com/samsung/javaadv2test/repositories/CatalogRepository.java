package com.samsung.javaadv2test.repositories;

import com.samsung.javaadv2test.repositories.models.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Long> {
}
