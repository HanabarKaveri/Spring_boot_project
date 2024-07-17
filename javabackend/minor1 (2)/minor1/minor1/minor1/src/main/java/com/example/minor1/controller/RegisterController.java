package com.example.minor1.controller;

import com.example.minor1.entities.Register;
import com.example.minor1.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegisterController {
    @Autowired
    public RegisterService service;

    @PostMapping(path="/addRegister")
    public ResponseEntity<String> addRegister(@RequestBody Register register) {
        service.saveRegister(register);
        return ResponseEntity.ok("Registration successful");
    }

    @PutMapping(path="/update/{email}")
    public Register updateRegister(@PathVariable String email, @RequestBody Register register) {
        return service.updateRegister(email, register);
    }


    @GetMapping(path="/user/{email}")
    public ResponseEntity<Register> getUserByEmail(@PathVariable String email) {
        Register user = service.getUserByEmail(email);
        return ResponseEntity.ok(user);
    }

    @GetMapping(path="/getAllUsers")
    public List<Register> getAllUsers() {
        return service.getAllUsers();
    }
}
