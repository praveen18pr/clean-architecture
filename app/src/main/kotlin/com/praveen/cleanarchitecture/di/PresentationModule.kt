package com.praveen.cleanarchitecture.di

import com.praveen.cleanarchitecture.viewmodels.MainActivityViewModel
import org.koin.dsl.module

val PresentationModule = module {
    single { MainActivityViewModel(get()) }
}