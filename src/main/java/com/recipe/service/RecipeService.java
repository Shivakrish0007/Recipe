package com.recipe.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.recipe.model.Recipe;

import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    List<Recipe> recipes = new ArrayList<Recipe>(
            Arrays.asList(new Recipe("Biryani", "Rice dish"), new Recipe("Roti", "Indian bread")));

    public List<Recipe> getRecepies() {

        return recipes;
    }

    public Recipe postRecipes(Recipe inputRecipe) {
        recipes.add(inputRecipe);
        return recipes.get(recipes.size() - 1);
    }

    public Recipe getrecipebyname(String recipe) {
        Recipe returnrecipe = null;

        for (int i = 0; i < recipes.size(); i++) {
            if (recipe.equals(recipes.get(i).getName())) {
                returnrecipe = recipes.get(i);
            }
        }
        return returnrecipe;
    }
    public Recipe deleterecipebyname(String recipe){
        Recipe deleterecipe=null;
        for (int i = 0; i < recipes.size(); i++) {
            if (recipe.equals(recipes.get(i).getName())) {
                deleterecipe=recipes.remove(i);
            }
        }
        return deleterecipe;
    }
    public Recipe editrecipebyname(String recipe){
        Recipe editrecipe=null;
        for (int i = 0; i < recipes.size(); i++) {
            if (recipe.equals(recipes.get(i).getName())) {
                editrecipe=recipes.remove(i);
            }
        }
       return editrecipe;
    }
}
