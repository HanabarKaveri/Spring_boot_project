package com.example.minor1.repository;

import com.example.minor1.entities.Ourwork;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OurworkRepository extends JpaRepository<Ourwork, Long> {
    Optional<Ourwork> findByStreet(String street);
    List<Ourwork> findByPincode(Long pincode); // Correct method name to match the entity field
    Optional<Ourwork> findByCity(String city); // Add method for finding by city

    List<Ourwork> findAllByOrderByDateDesc(); // New method to fetch all entries sorted by date descending



}