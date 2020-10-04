package com.praveen.cleanarchitecture.views

import android.os.Bundle
import com.praveen.cleanarchitecture.R
import com.praveen.cleanarchitecture.base.BaseActivity
import com.praveen.cleanarchitecture.viewmodels.MainActivityViewModel

class MainActivity : BaseActivity<MainActivityViewModel>() {

    // TODO use compose instead of default XML
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.fetchNewsList()
    }

    override fun getLayoutId() = R.layout.activity_main

    override fun createViewModel() = MainActivityViewModel::class.java

    override fun subscribeToObservers() {

    }
}