package com.recipe;

import com.recipe.dto.RecipeDTO;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public RecipeDTO recipe() {
        return new RecipeDTO();
    }
}