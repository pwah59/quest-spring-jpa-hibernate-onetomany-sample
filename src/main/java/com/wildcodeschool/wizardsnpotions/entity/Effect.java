package com.wildcodeschool.wizardsnpotions.entity;

import java.time.*; 
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Effect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    public Effect() {
    }
    
    public Effect(String description) {
        this.description = description;
    }
    
    // getters and setters 
    
    public String GetDescription(){
    return this.description;
    }
    
    public void SetDescription(String description){
        this.description = description;
    }

   
}