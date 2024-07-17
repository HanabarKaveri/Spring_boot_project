package com.example.minor1.repository;

import com.example.minor1.entities.Register;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegisterRepository extends JpaRepository<Register,String> {


    Optional<Register> findByEmail(String email);

}
