package com.example.minor1.repository;

import com.example.minor1.entities.Upcoming;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpcomingRepository extends JpaRepository<Upcoming, String> {
}
