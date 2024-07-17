package com.example.minor1.exceptions;

public class RegisterNotFoundException extends RuntimeException {
    public RegisterNotFoundException(String message) {
        super(message);
    }
}
