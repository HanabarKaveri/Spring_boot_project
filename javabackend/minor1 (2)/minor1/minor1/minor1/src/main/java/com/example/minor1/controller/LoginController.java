package com.example.minor1.controller;

import com.example.minor1.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(path="/login")
    public ResponseEntity<String> newLogin(@RequestBody LoginRequest loginRequest) {
        if (loginService.loginUser(loginRequest.getEmailid(), loginRequest.getPassword())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid email or password");
        }
    }
}

// Separate class for login request payload
class LoginRequest {
    private String emailid;
    private String password;

    // Getters and setters...

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

