package com.example.minor1.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Donate {
    @Id
    public String email;

    public long phone_number;

    public String  upi_id;

    public String utr;
    public long amount;

    public String reviews;



    public Donate() {

    }

    public long getAmount() {
        return amount;
    }



    public String getEmail() {
        return email;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public String getUpi_id() {
        return upi_id;
    }

    public String getUtr() {
        return utr;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public void setUpi_id(String upi_id) {
        this.upi_id = upi_id;
    }

    public void setUtr(String utr) {
        this.utr = utr;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public Donate(String email, long phone_number, String upi_id, String utr, long amount) {
        this.email = email;
        this.phone_number = phone_number;
        this.upi_id = upi_id;
        this.utr = utr;
        this.amount = amount;
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Donate{" +
                "email='" + email + '\'' +
                ", phone_number=" + phone_number +
                ", upi_id='" + upi_id + '\'' +
                ", utr='" + utr + '\'' +
                ", amount=" + amount +
                ", reviews='" + reviews + '\'' +
                '}';
    }
}