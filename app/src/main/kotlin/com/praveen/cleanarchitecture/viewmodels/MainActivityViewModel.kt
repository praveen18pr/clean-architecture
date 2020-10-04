package com.praveen.cleanarchitecture.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.praveen.domain.usecases.UseCaseFactory
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class MainActivityViewModel : ViewModel(), KoinComponent {

    private val useCaseFactory by inject<UseCaseFactory>()

    fun fetchNewsList() {
        viewModelScope.launch {
            val fetchNewsList = useCaseFactory.fetchNewsList()
            fetchNewsList.collect {
                println("Current thread :${Thread.currentThread().name}")
                println("The news List size is : ${it.status}")
            }
        }
    }
}