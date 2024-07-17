package com.example.minor1.services;

import com.example.minor1.entities.Ourwork;
import com.example.minor1.repository.OurworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OurworkService {
    @Autowired
    private OurworkRepository repository;

//    public Ourwork saveOurwork(Ourwork ourwork){
//        return repository.save(ourwork);
//    }

    public Ourwork findLatestCampaign() {
        List<Ourwork> campaigns = repository.findAllByOrderByDateDesc();
        if (!campaigns.isEmpty()) {
            return campaigns.get(0); // Returns the latest campaign
        } else {
            return null; // No campaigns found
        }
    }

    public Ourwork addLocation(Ourwork ourwork) {
        return repository.save(ourwork);
    }

    public List<Ourwork> findAllLocations() {
        return repository.findAll();
    }


    public List<Ourwork> findByPincode(Long pincode) {
        return repository.findByPincode(pincode);
    }

    public Ourwork findByStreet(String street) {
        return repository.findByStreet(street).orElse(null);
    }

    public Ourwork findByCity(String city) {
        return repository.findByCity(city).orElse(null);
    }







}