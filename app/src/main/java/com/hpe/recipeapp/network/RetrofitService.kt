package com.hpe.recipeapp.network

import com.hpe.recipeapp.network.model.RecipeNetworkEntity
import com.hpe.recipeapp.network.response.RecipeSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RecipeService  {
    @GET("/api/v2/categories")
    suspend fun getCategories(
    ): RecipeNetworkEntity

    @GET("/api/v2/recipes")
    suspend fun searchRecipes(
        @Query("page") page: Int,
        @Query("q") query: String
    ): RecipeSearchResponse

    @GET("/api/get")
    suspend fun getRecipeDetails(
        @Query("rId") id: Int
    ): RecipeNetworkEntity
}