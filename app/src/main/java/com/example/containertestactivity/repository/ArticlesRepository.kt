package com.example.containertestactivity.repository

import com.example.containertestactivity.models.Article
import kotlinx.coroutines.flow.Flow

interface ArticlesRepository {

    fun getArticles(): Flow<List<Article>>

}