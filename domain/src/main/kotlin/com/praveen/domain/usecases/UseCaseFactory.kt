package com.praveen.domain.usecases

import com.praveen.domain.gateway.NewsListGateway

class UseCaseFactory(
    private val newsListGateway: NewsListGateway
) {

    suspend fun fetchNewsList() = newsListGateway.fetchNewsList()
}