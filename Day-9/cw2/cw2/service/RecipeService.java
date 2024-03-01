package com.example.cw2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cw2.model.Recipe;
import com.example.cw2.repository.RecipeRepo;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService
{
    @Autowired
    RecipeRepo recipeRepo;
    public Recipe addRecipes(Recipe recipe)
    {
        return recipeRepo.save(recipe);
    }
    public List<Recipe> getByName(String recipeName)
    {
        return recipeRepo.findByRecipeName(recipeName);
    }
    public Optional<Recipe> getById(int recipeId)
    {
        return recipeRepo.findById(recipeId);
    }
}