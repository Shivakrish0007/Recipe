package com.recipe.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.recipe.dto.RecipeDTO;
import com.recipe.entity.Recipe;
import com.recipe.repository.RecipeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {
    @Autowired
    RecipeRepository recipeRepository;

    public Iterable<RecipeDTO> getRecepies() {
        Iterable<Recipe> a=  recipeRepository.findAll();
        List<RecipeDTO> r = new ArrayList<>();
    
        for(Recipe recipe : a){
            RecipeDTO dto = new RecipeDTO(recipe.getName(), recipe.getDescription());
            r.add(dto);
        }
        return r;
    }

    public RecipeDTO postRecipes(RecipeDTO inputRecipe) {
        Recipe r = new Recipe(inputRecipe.getName(), inputRecipe.getDescription());
        Recipe d = recipeRepository.save(r);
        return new RecipeDTO(d.getName(), d.getDescription());
    }

    public RecipeDTO getrecipebyname(String x) {
        Optional<Recipe> result = recipeRepository.findById(x);
        if(result.isPresent()){
            return new RecipeDTO(result.get().getName(), result.get().getDescription());
        }
        return new RecipeDTO();
    }

    public void deleterecipebyname(String y) {
        Optional<Recipe> result = recipeRepository.findById(y);

        if(result.isPresent()){
         recipeRepository.delete(result.get());
        }
    }

    public RecipeDTO editrecipebyname(String recipeName, RecipeDTO body) {
       Optional<Recipe> result = recipeRepository.findById(recipeName);

        if(result.isPresent()){
            String a =   result.get().getDescription();
            a=body.getDescription();
            result.get().setDescription(a);
            recipeRepository.save(result.get());

        }
        return getrecipebyname(recipeName);
    }
}
