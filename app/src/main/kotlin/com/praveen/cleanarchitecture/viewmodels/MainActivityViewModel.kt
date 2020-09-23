package com.praveen.cleanarchitecture.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var testLiveData = MutableLiveData<Boolean>()
}