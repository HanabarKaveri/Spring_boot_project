package com.example.minor1.services;

import com.example.minor1.entities.Register;
import com.example.minor1.exceptions.RegisterNotFoundException;
import com.example.minor1.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {
    @Autowired
    public RegisterRepository repository;

    public Register saveRegister(Register register) {
        return repository.save(register);
    }

    public Register updateRegister(String email, Register register) {
        Register existingRegister = repository.findById(email)
                .orElseThrow(() -> new RegisterNotFoundException("Register with email " + email + " not found"));

        existingRegister.setEmail(register.getEmail());
        existingRegister.setFirst_name(register.getFirst_name());
        existingRegister.setLast_name(register.getLast_name());
        existingRegister.setPhone_number(register.getPhone_number());
        existingRegister.setStreet(register.getStreet());
        existingRegister.setPincode(register.getPincode());
        existingRegister.setLocation(register.getLocation());
        existingRegister.setPassword(register.getPassword());

        return repository.save(existingRegister);
    }


    public Register getUserByEmail(String email) {
        return repository.findByEmail(email)
                .orElseThrow(() -> new RegisterNotFoundException("User with email " + email + " not found"));
    }

    public List<Register> getAllUsers() {
        return repository.findAll();
    }
}
