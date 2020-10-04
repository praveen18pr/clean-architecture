package com.praveen.cleanarchitecture.di

import com.praveen.data.newslist.RetrofitNewsListGateway
import com.praveen.domain.gateway.NewsListGateway
import org.koin.dsl.module

val dataModule = module {
    single<NewsListGateway> { RetrofitNewsListGateway(get()) }
}