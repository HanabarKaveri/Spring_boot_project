package com.example.minor1.entities;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Ourwork {
    @Id
    private long pincode;
    private String place;
    private String street;
    private String city;


    private LocalDate date;


    public Ourwork() {}

    public Ourwork(String place, String street, String city, long pincode,LocalDate date) {
        this.place = place;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
        this.date = date;
    }

    // Getters and Setters
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Ourwork{" +
                "pincode=" + pincode +
                ", place='" + place + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", date=" + date +
                '}';
    }
}