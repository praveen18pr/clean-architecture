package com.praveen.domain.usecases

class UseCaseFactory(
    private val newsListUseCase: NewsListUseCase
) {

    suspend fun fetchNewsList() = newsListUseCase.fetchNewsList()
}