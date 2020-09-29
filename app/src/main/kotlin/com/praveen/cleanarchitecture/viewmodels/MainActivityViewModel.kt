package com.praveen.cleanarchitecture.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.praveen.domain.usecases.UseCaseFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivityViewModel(
    private val useCaseFactory: UseCaseFactory
) : ViewModel() {

    var testLiveData = MutableLiveData<Boolean>()

    fun fetchNewsList() {
        CoroutineScope(Dispatchers.IO).launch {
            val fetchNewsList = useCaseFactory.fetchNewsList()
            fetchNewsList.collect {
                println("The news List size is : ${it.size}")
            }
        }
    }
}