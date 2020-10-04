package com.praveen.domain.gateway

import com.praveen.domain.NewsResponse
import kotlinx.coroutines.flow.Flow

interface NewsListGateway {

    suspend fun fetchNewsList(): Flow<NewsResponse>
}