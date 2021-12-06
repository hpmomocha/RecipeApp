package com.hpe.recipeapp.presentation.ui.recipe_list

import androidx.lifecycle.ViewModel
import com.hpe.recipeapp.repository.RecipeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class RecipeListViewModel @Inject constructor(
    private val repository: RecipeRepository,
    private @Named("auth_token") val token: String,
) : ViewModel() {
    init {
        println("ViewModel: $repository")
        println("ViewModel: $token")
    }
    fun getRepo() = repository

    fun getToken() = token
}