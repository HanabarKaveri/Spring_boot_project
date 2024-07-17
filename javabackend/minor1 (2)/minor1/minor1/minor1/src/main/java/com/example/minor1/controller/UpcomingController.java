package com.example.minor1.controller;

import com.example.minor1.entities.Upcoming;
import com.example.minor1.services.UpcomingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class UpcomingController {

    @Autowired
    private UpcomingService upcomingService;

    @PostMapping("/saveupcoming")
    public Upcoming saveUpcoming(@RequestBody Upcoming upcoming) {
        return upcomingService.saveUpcoming(upcoming);
    }

    @GetMapping("/upcomingprojects")
    public List<Upcoming> getUpcomingProjects() {
        return upcomingService.getAllUpcoming();
    }
}
