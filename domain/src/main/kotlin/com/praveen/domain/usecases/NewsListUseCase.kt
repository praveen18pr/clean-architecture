package com.praveen.domain.usecases

import com.praveen.domain.NewsResponse
import com.praveen.domain.base.UseCase
import com.praveen.domain.gateway.NewsListGateway
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class NewsListUseCase(
    private val newsListGateway: NewsListGateway
) : UseCase<NewsResponse>() {

    override suspend fun makeAPICall(): Flow<NewsResponse> =
        newsListGateway.fetchNewsList().flowOn(Dispatchers.IO)
}