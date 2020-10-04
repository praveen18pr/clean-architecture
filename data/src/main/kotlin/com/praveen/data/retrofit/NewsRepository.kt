package com.praveen.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NewsRepository {

    companion object {
        private const val BASE_URL = "https://api.nytimes.com/svc/"
        private const val NEWS_DELAY = 2000L
        //API key = NpMD3rGsJdSQxAoMTlUGQue9eHGrGw40
    }

    val newsService: NewsService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(NewsService::class.java)
}