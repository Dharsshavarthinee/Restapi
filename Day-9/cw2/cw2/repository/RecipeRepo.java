package com.example.cw2.repository;
import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.cw2.model.Recipe;
@Repository
public interface RecipeRepo extends JpaRepository<Recipe,Integer>
{
    @Modifying
    @Transactional
    // @Query(value="insert into recipe(recipe_id,title,ingredients,instructions,recipe_name) values (?1,?2,?3,?4,?5)",nativeQuery=true)
    // void saveRecipes(int recipeId,String title,String ingredients,String instructions,String recipeName);
    // @Query("select p from Recipe p where p.recipeName= ?1"

    List<Recipe> findByRecipeName(String recipeName);
    @Query("select p from Recipe p where p.recipeId= ?1")
    Optional<Recipe>findById(int recipeId);

    
}

