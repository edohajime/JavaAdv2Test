package com.samsung.javaadv2test.repositories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 150)
    private String name;

    @Column(length = 200)
    private String picture;

    private Long price;
}
