package com.example.minor1.services;

import com.example.minor1.entities.Upcoming;
import com.example.minor1.repository.UpcomingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpcomingService {

    @Autowired
    private UpcomingRepository upcomingRepository;

    public Upcoming saveUpcoming(Upcoming upcoming) {
        return upcomingRepository.save(upcoming);
    }

    public List<Upcoming> getAllUpcoming() {
        return upcomingRepository.findAll();
    }
}
