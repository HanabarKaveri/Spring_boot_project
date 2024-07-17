package com.example.minor1.controller;

import com.example.minor1.entities.Ourwork;
import com.example.minor1.services.OurworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.security.Provider;
import java.util.List;

@RestController
@RequestMapping("/ourwork")
public class OurworkController {
    @Autowired
    private OurworkService service;

    @PostMapping("/savelocations")
    public Ourwork saveOurLocation(@RequestBody Ourwork ourwork) {

            return service.addLocation(ourwork);

    }

    @GetMapping("/findalllocations")
    public List<Ourwork> findAllLocations() {
        return service.findAllLocations();
    }



    @GetMapping("/latestcampaign")
    public Ourwork getLatestCampaign() {
        return service.findLatestCampaign();
    }

    @GetMapping("/findbypincode/{pincode}")
    public List<Ourwork> findByPincode(@PathVariable Long pincode) {
        return service.findByPincode(pincode);
    }

    @GetMapping("/findbystreet/{street}")
    public Ourwork findByStreet(@PathVariable String street) {
        return service.findByStreet(street);
    }

    @GetMapping("/findbycity/{city}")
    public Ourwork findByCity(@PathVariable String city) {
        return service.findByCity(city);
    }





}