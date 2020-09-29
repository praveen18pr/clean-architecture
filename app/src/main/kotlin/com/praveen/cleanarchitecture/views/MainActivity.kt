package com.praveen.cleanarchitecture.views

import android.os.Bundle
import com.praveen.cleanarchitecture.R
import com.praveen.cleanarchitecture.base.BaseActivity
import com.praveen.cleanarchitecture.viewmodels.MainActivityViewModel
import com.praveen.domain.DomainTest

class MainActivity : BaseActivity<MainActivityViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DomainTest().printSomething()
        viewModel.fetchNewsList()
    }

    override fun getLayoutId() = R.layout.activity_main

    override fun createViewModel() = MainActivityViewModel::class.java

    override fun subscribeToObservers() {

    }
}