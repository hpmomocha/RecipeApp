package com.hpe.recipeapp.repository

import com.hpe.recipeapp.domain.model.Recipe
import com.hpe.recipeapp.network.RecipeService
import com.hpe.recipeapp.network.model.RecipeDtoMapper

class RecipeRepository_Impl(
    private val recipeService: RecipeService,
    private val mapper: RecipeDtoMapper
) : RecipeRepository {
    override suspend fun searchRecipe(token: String, page: Int, query: String): List<Recipe> {
        return mapper.toDomainList(recipeService.searchRecipes(page, query).recipes)
    }

    override suspend fun getRecipeDetails(token: String, rId: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.getRecipeDetails(rId))
    }
}