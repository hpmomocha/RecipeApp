package com.hpe.recipeapp.network.response

import com.google.gson.annotations.SerializedName
import com.hpe.recipeapp.network.model.RecipeDto

data class RecipeSearchResponse(
    @SerializedName("count")
    var count: Int,

    @SerializedName("recipes")
    var recipes: List<RecipeDto>
)