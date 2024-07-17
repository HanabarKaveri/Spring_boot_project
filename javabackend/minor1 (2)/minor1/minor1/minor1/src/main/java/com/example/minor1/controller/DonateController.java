package com.example.minor1.controller;

import com.example.minor1.entities.Donate;
import com.example.minor1.services.DonateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DonateController {
    @Autowired
     public DonateService donateService;
    @PostMapping(path="/addDonate")
     public Donate saveDonates(@RequestBody Donate donate)
     {
         return donateService.saveDoante(donate);
     }
    @GetMapping(path="/getDonations")
     public List<Donate>  findDonates()
     {
         return donateService.findAllDonate();
     }


     @DeleteMapping(path="/deleteDonation/{email}")
     public  String deleteDonations(String email)
     {
        donateService.deleteById(email);
         return "Donation removed";
     }
}
