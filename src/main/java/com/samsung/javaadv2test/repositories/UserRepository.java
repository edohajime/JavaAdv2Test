package com.samsung.javaadv2test.repositories;

import com.samsung.javaadv2test.repositories.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);
}
