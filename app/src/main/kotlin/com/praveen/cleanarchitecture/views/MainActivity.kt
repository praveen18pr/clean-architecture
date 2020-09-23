package com.praveen.cleanarchitecture.views

import com.praveen.cleanarchitecture.R
import com.praveen.cleanarchitecture.base.BaseActivity
import com.praveen.cleanarchitecture.viewmodels.MainActivityViewModel

class MainActivity : BaseActivity() {

    override fun getLayoutId() = R.layout.activity_main

    override fun generateViewModel() = MainActivityViewModel()
}