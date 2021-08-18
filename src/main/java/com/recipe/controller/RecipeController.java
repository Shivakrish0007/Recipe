package com.recipe.controller;

import com.recipe.dto.RecipeDTO;
import com.recipe.service.RecipeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping("/recipes")
    public Iterable<RecipeDTO> getRecipe() {
       Iterable<RecipeDTO> recipes = recipeService.getRecepies();
       return recipes;
    }

    @PostMapping("/recipe")
    public RecipeDTO postRecipe(@RequestBody RecipeDTO inputRecipe){
       RecipeDTO recipe = recipeService.postRecipes(inputRecipe);
        return recipe;
    }

    @GetMapping("/recipe")
     public RecipeDTO getrecipebyname(@RequestParam String recipename){
       RecipeDTO recipe=recipeService.getrecipebyname(recipename);
        return recipe;
    }

     @DeleteMapping("/recipe")
     public void deleterecipebyname(@RequestParam String recipename){
       recipeService.deleterecipebyname(recipename);
    }

    @PutMapping("/recipe")
    public void editrecipebyname(@RequestParam String recipename, @RequestBody RecipeDTO body){
      recipeService.editrecipebyname(recipename, body);   
    }
}
