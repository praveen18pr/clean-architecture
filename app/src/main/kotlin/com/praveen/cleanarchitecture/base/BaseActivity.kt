package com.praveen.cleanarchitecture.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseActivity<M : ViewModel> : AppCompatActivity() {

    protected lateinit var viewModel: M

    abstract fun getLayoutId(): Int

    abstract fun createViewModel(): Class<M>

    abstract fun subscribeToObservers()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        generateViewModel()
        subscribeToObservers()
    }

    private fun generateViewModel() {
        viewModel = ViewModelProvider(this).get(createViewModel())
    }
}