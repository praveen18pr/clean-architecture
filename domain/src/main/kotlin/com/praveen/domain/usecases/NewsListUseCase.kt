package com.praveen.domain.usecases

import com.praveen.domain.base.UseCase
import com.praveen.domain.gateway.NewsListGateway
import kotlinx.coroutines.flow.Flow

class NewsListUseCase(
    private val newsListGateway: NewsListGateway
) : UseCase<List<Any>>() {

    override suspend fun makeAPICall(): Flow<List<Any>> = newsListGateway.fetchNewsList()
}