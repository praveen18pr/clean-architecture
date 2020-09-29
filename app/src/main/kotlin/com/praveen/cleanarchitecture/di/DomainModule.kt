package com.praveen.cleanarchitecture.di

import com.praveen.domain.usecases.UseCaseFactory
import org.koin.dsl.module

val domainModule = module {
    single { UseCaseFactory(get()) }
}