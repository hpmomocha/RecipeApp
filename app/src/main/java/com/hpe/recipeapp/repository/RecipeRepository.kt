package com.hpe.recipeapp.repository

import com.hpe.recipeapp.domain.model.Recipe

interface RecipeRepository {
    suspend fun searchRecipe(token: String, page: Int, query: String): List<Recipe>

    suspend fun getRecipeDetails(token: String, rId: Int): Recipe
}