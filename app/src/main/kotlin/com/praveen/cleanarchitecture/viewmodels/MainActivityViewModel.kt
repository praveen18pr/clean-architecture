package com.praveen.cleanarchitecture.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.praveen.domain.NewsArticle
import com.praveen.domain.usecases.UseCaseFactory
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class MainActivityViewModel : ViewModel(), KoinComponent {

    // TODO learn and write test cases
    private val useCaseFactory by inject<UseCaseFactory>()

    private val _newsListLiveData = MutableLiveData<List<NewsArticle>>()
    val newsListLiveData: LiveData<List<NewsArticle>>
        get() = _newsListLiveData

    fun fetchNewsList() {
        viewModelScope.launch {
            val fetchNewsList = useCaseFactory.fetchNewsList()
            fetchNewsList.collect {
                println("Current thread :${Thread.currentThread().name}")
                println("The news List size is : ${it.status}")
                _newsListLiveData.value = it.results
            }
        }
    }
}