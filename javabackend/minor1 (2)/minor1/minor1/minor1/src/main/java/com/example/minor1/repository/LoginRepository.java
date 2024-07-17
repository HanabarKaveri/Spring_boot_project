package com.example.minor1.repository;

import com.example.minor1.entities.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login, String> {
    Optional<Login> findByEmailid(String emailid);
}
