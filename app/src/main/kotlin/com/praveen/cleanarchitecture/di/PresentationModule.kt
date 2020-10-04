package com.praveen.cleanarchitecture.di

import com.praveen.cleanarchitecture.viewmodels.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val PresentationModule = module {

    viewModel {
        MainActivityViewModel()
    }
}