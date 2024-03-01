package com.example.day6_1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="children")
public class Children {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int babyId;
    String babyFirstName;
    String babyLastName;
    String fatherName;
    String motherName;
    String address;
    public int getBabyId() {
        return babyId;
    }
    public void setBabyId(int babyId) {
        this.babyId = babyId;
    }
    public String getBabyFirstName() {
        return babyFirstName;
    }
    public void setBabyFirstName(String babyFirstName) {
        this.babyFirstName = babyFirstName;
    }
    public String getBabyLastName() {
        return babyLastName;
    }
    public void setBabyLastName(String babyLastName) {
        this.babyLastName = babyLastName;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getMotherName() {
        return motherName;
    }
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
