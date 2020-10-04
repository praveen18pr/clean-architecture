package com.praveen.data.newslist

import com.praveen.data.retrofit.NewsRepository
import com.praveen.domain.gateway.NewsListGateway
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.transform

class RetrofitNewsListGateway(
    private val newsRepository: NewsRepository
) : NewsListGateway {

    override suspend fun fetchNewsList(): Flow<List<Any>> =
        newsRepository.newsService.getNews().transform {
            println("in the news list gateway :${it.results.size}")
            it.results.asFlow()
        }
}