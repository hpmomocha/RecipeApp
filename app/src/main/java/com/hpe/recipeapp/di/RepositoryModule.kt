package com.hpe.recipeapp.di

import com.hpe.recipeapp.network.RecipeService
import com.hpe.recipeapp.network.model.RecipeDtoMapper
import com.hpe.recipeapp.repository.RecipeRepository
import com.hpe.recipeapp.repository.RecipeRepository_Impl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideRecipeRepository(recipeService: RecipeService, recipeMapper: RecipeDtoMapper): RecipeRepository {
        return RecipeRepository_Impl(recipeService, recipeMapper)
    }
}