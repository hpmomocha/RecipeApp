package com.hpe.recipeapp.network.response

import com.google.gson.annotations.SerializedName
import com.hpe.recipeapp.network.model.RecipeNetworkEntity

class RecipeSearchResponse(
    @SerializedName("count")
    var count: Int,

    @SerializedName("recipes")
    var recipes: List<RecipeNetworkEntity>
)