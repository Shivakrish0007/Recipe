package com.recipe.repository;

import com.recipe.entity.Recipe;

import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, String>  {
}
