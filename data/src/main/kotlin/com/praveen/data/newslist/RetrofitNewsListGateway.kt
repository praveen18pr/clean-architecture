package com.praveen.data.newslist

import com.praveen.data.retrofit.NewsService
import com.praveen.domain.gateway.NewsListGateway
import kotlinx.coroutines.flow.Flow

class RetrofitNewsListGateway(
    private val newsService: NewsService
) : NewsListGateway {

    override suspend fun fetchNewsList(): Flow<List<Any>> = newsService.getNews()

}