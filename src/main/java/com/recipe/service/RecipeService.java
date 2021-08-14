package com.recipe.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.recipe.model.Recipe;

import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    
    List<Recipe> recipes = new ArrayList<Recipe>(Arrays.asList(new Recipe("Biryani", "Rice dish"), new Recipe("Roti", "Indian bread")));

    public List<Recipe> getRecepies() {

        return recipes;
    }

    public Recipe postRecipes(Recipe inputRecipe) {
        recipes.add(inputRecipe);
        return recipes.get(recipes.size() - 1);
    }
    
}
