package com.recipe.controller;

import java.util.List;

import com.recipe.model.Recipe;
import com.recipe.service.RecipeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping("/recipe")
    public List<Recipe> getRecipe() {
       List<Recipe> recipes = recipeService.getRecepies();
       return recipes;
    }
    @PostMapping("/recipe")
    public Recipe postRecipe(@RequestBody Recipe inputRecipe){
       Recipe recipe=recipeService.postRecipes(inputRecipe);
        return recipe;

    }
    
}
