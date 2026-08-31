package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    public Long id;

    public Long name;
    public String country;

    public Long getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
    
    public String getCountry() {
        return country;
    }
     
    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(Long name) {
        this.name = name;
    }
}
