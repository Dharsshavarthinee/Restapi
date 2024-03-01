package com.example.cw2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw2.model.Recipe;
import com.example.cw2.service.RecipeService;



@RestController
public class RecipeController
{
@Autowired
RecipeService recipeService;
@PostMapping("/api/recipe")
public ResponseEntity<?> addRecipes(@RequestBody Recipe recipe)
{
    
    return ResponseEntity.status(201).body(recipeService.addRecipes(recipe));
}
@GetMapping("/api/recipe/byname")
public ResponseEntity<?> getRecipeByName(@RequestParam String recipeName)
{
    try{
        return ResponseEntity.status(200).body(recipeService.getByName(recipeName));
    }
    catch(Exception e)
    {
        return ResponseEntity.status(500).build();
    }
}
@GetMapping("/api/recipe/{recipeId}")
public ResponseEntity<?> getRecipeById(@PathVariable int recipeId)
{
    try{
        return ResponseEntity.status(200).body(recipeService.getById(recipeId));
    }
    catch(Exception e)
    {
        return ResponseEntity.status(500).build();
    }
}


}

