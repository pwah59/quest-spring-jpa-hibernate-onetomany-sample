package com.wildcodeschool.wizardsnpotions.entity;

import java.time.*; 
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //liaison PotionIngredient
    @OneToMany(mappedBy = "ingredient", cascade = CascadeType.ALL)
    private List<PotionIngredient> potionIngredients = new ArrayList<>();
            
    public Ingredient() {
    }
    
    public Ingredient(String name) {
        this.name = name;
    }
    
    

   // getters and setters 
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}