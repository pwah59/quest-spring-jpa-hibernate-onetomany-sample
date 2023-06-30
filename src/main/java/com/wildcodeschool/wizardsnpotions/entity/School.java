package com.wildcodeschool.wizardsnpotions.entity;

import java.time.*; 
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.*;
import java.util.List;

import java.sql.Date;
import java.util.List;

@Entity
public class School {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long capacity;
    private String country;
    
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Wizards> wizards;

    public School() {
    }
    
    public School(String name,Long capacity,String country) {
        this.name = name;
        this.capacity = capacity;
        this.country = country;
    }

    //getters + setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public List<Wizards> getWizards() {
        return wizards;
    }

    public void setWizards(List<Wizards> wizards) {
        this.wizards = wizards;
    }
}
