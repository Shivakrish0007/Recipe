package com.recipe;

import com.recipe.model.Recipe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Recipe recipe() {
        return new Recipe();
    }
}