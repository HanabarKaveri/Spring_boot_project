package com.example.minor1.repository;

import com.example.minor1.entities.Donate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonateRepository extends JpaRepository<Donate,String> {
}
