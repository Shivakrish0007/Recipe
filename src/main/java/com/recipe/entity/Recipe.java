package com.recipe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recipe {
    @Id
    String name;
    String description;

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Recipe() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
