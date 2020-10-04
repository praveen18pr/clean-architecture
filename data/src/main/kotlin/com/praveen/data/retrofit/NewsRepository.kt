package com.praveen.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NewsRepository {

    // TODO Enable logger
    // TODO handle error scenarios
    // TODO handle header parameters

    // NewsListResponse - Domain

    // Base class for all response, sealed class
    // extend class - exception
    // Response, Exception

    // any critical exception - token expiry etc , we will handle it here
    // Viewmodel for base class - all the redirections in terms on failure , logout, etc

    companion object {
        private const val BASE_URL = "https://api.nytimes.com/svc/"
        //API key = NpMD3rGsJdSQxAoMTlUGQue9eHGrGw40
    }

    val newsService: NewsService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(NewsService::class.java)
}