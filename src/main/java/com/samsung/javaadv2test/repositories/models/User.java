package com.samsung.javaadv2test.repositories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 150, unique = true)
    private String username;

    @Column(length = 255)
    private String password;
    private String confirmPassword;

    private String email;
    private String fullname;
    private boolean status;
}
