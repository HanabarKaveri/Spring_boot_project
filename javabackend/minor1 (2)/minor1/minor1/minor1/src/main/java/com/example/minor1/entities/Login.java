package com.example.minor1.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
    @Id
    private String emailid;
    private String password; // Assuming the password is stored as a string

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

    public Login() {
        // Default constructor
    }

    public Login(String emailid, String password) {
        this.emailid = emailid;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "emailid='" + emailid + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
