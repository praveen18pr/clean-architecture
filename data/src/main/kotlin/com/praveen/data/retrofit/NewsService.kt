package com.praveen.data.retrofit

import com.praveen.data.models.NewsResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface NewsService {

    @GET("mostpopular/v2/emailed/7.json?api-key=NpMD3rGsJdSQxAoMTlUGQue9eHGrGw40")
    fun getNews(): Flow<NewsResponse>
}