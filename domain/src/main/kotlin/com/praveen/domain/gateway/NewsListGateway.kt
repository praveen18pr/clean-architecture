package com.praveen.domain.gateway

import kotlinx.coroutines.flow.Flow

interface NewsListGateway {

    suspend fun fetchNewsList(): Flow<List<Any>>

}