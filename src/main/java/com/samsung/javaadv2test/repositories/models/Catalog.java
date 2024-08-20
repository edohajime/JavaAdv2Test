package com.samsung.javaadv2test.repositories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "catalogs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Catalog {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 150)
    private String name;

    private boolean status;

    @OneToMany
    @JoinColumn(name = "catalog_id")
    private List<Product> products;
}
