package com.praveen.domain.usecases

import com.praveen.domain.NewsResponse
import com.praveen.domain.base.UseCase
import com.praveen.domain.gateway.NewsListGateway
import kotlinx.coroutines.flow.Flow

class NewsListUseCase(
    private val newsListGateway: NewsListGateway
) : UseCase<NewsResponse>() {

    suspend fun fetchNewsList() = execute()

    override suspend fun makeAPICall(): Flow<NewsResponse> = newsListGateway.fetchNewsList()
}