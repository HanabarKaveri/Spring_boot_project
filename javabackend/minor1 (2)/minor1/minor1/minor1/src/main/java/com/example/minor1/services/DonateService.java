package com.example.minor1.services;


import com.example.minor1.entities.Donate;
import com.example.minor1.entities.Register;
import com.example.minor1.repository.DonateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DonateService {
    @Autowired
    public DonateRepository donaterepository;

    public Donate saveDoante(  Donate  donate )
    {
        return donaterepository.save(donate);

    }
    public List<Donate> findAllDonate()
    {
        return donaterepository.findAll();
    }

    public String deleteById(String email) {
        donaterepository.deleteById(email);
        return "Donation Removed " + email;
    }
    public List<String> findAllDonationReviews() {
        List<Donate> donations = donaterepository.findAll();
        List<String> reviews = new ArrayList<>();
        for (Donate donation : donations) {
            if (donation.getReviews() != null && !donation.getReviews().isEmpty()) {
                reviews.add(donation.getReviews());
            }
        }
        return reviews;
    }





}