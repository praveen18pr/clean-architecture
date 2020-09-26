package com.praveen.cleanarchitecture.base

import android.app.Activity
import android.os.Bundle
import androidx.lifecycle.ViewModel

abstract class BaseActivity : Activity() {

    private lateinit var viewModel: ViewModel

    abstract fun getLayoutId(): Int

    abstract fun generateViewModel(): ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        viewModel = generateViewModel()
    }
}