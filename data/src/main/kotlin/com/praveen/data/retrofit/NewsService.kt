package com.praveen.data.retrofit

import com.praveen.domain.NewsResponse
import retrofit2.Response
import retrofit2.http.GET

interface NewsService {

    @GET("mostpopular/v2/emailed/7.json?api-key=NpMD3rGsJdSQxAoMTlUGQue9eHGrGw40")
    suspend fun getNews(): Response<NewsResponse>
}