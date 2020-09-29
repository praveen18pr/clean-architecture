package com.praveen.domain.base

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

abstract class UseCase<T> {

    abstract fun makeAPICall(): Flow<T>

    fun execute() = makeAPICall().flowOn(Dispatchers.IO)
}