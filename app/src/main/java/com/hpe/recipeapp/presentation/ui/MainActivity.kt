package com.hpe.recipeapp.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hpe.recipeapp.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var app: RecipeApplication
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("onCreate: the app context: ${app}")
    }
}