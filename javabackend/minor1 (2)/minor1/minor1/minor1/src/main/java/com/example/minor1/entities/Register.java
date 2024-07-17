package com.example.minor1.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Register {
    @Id
    private String email;
    private String first_name;
    private String last_name;
    private long phone_number;
    private String street;
    private Long pincode;
    private String location;

    private String password;

    public Register() {}



    public Register(String email, String first_name, String last_name, long phone_number,String street,Long pincode, String location, String password) {
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.street = street;
        this.pincode = pincode;
        this.location = location;
        this.password = password;
    }

    // Getters and setters...
    public String getEmail() {
        return email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Register{" +
                "email='" + email + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone_number=" + phone_number +
                ", street='" + street + '\'' +
                ", pincode=" + pincode +
                ", location='" + location + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public String getLocation() {
        return location;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
