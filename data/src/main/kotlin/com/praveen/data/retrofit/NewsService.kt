package com.praveen.data.retrofit

import com.devtides.androidcoroutinesretrofit.model.NewsArticle
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface NewsService {

    @GET("news.json")
    suspend fun getNews(): Flow<List<NewsArticle>>
}