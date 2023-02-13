package com.example.containertestactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.containertestactivity.composables.ArticlesScreen
import com.example.containertestactivity.ui.theme.InstrumentationTestsHiltTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstrumentationTestsHiltTheme {
                ArticlesScreen(hiltViewModel())
            }
        }
    }
}