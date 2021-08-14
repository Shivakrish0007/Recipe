package com.recipe.controller;

import java.util.List;
import java.util.Arrays;

import com.recipe.model.Recipe;
import com.recipe.service.RecipeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping("/recipes")
    public List<Recipe> getRecipe() {
       List<Recipe> recipes = recipeService.getRecepies();
       return recipes;
    }
    @PostMapping("/recipe")
    public Recipe postRecipe(@RequestBody Recipe inputRecipe){
       Recipe recipe=recipeService.postRecipes(inputRecipe);
        return recipe;
    }

    @GetMapping("/recipe")
     public Recipe getrecipebyname(@RequestParam String recipename){
       Recipe recipe=recipeService.getrecipebyname(recipename);
        return recipe;
    }

     @DeleteMapping("/recipe")
     public Recipe deleterecipebyname(@RequestParam String recipename){
       Recipe recipe=recipeService.deleterecipebyname(recipename);
        return recipe;
    }
    @PutMapping("/recipe")
    public Recipe editrecipebyname(@RequestParam String recipename){
        Recipe recipe=recipeService.editrecipebyname(recipename);
         return recipe;
     }
    
    
}
