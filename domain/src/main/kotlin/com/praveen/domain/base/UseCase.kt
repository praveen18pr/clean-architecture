package com.praveen.domain.base

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

abstract class UseCase<T> {

    abstract suspend fun makeAPICall(): Flow<T>

    suspend fun execute() = makeAPICall().flowOn(Dispatchers.IO)
}