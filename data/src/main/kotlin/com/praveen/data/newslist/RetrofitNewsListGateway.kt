package com.praveen.data.newslist

import com.praveen.data.retrofit.NewsRepository
import com.praveen.domain.NewsResponse
import com.praveen.domain.gateway.NewsListGateway
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RetrofitNewsListGateway(
    private val newsRepository: NewsRepository
) : NewsListGateway {

    override suspend fun fetchNewsList(): Flow<NewsResponse> =
        flow {
            val news = newsRepository.newsService.getNews()
            emit(news.body()!!)
        }
}