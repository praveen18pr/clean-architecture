package com.praveen.cleanarchitecture.views

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.praveen.cleanarchitecture.R
import com.praveen.cleanarchitecture.adapters.NewsListAdapter
import com.praveen.cleanarchitecture.base.BaseActivity
import com.praveen.cleanarchitecture.viewmodels.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainActivityViewModel>() {
    private lateinit var newsListAdapter: NewsListAdapter

    // TODO use compose instead of default XML
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initUi()
    }

    private fun initUi() {
        setupRecyclerView()
        viewModel.fetchNewsList()
    }

    private fun setupRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(
            baseContext, LinearLayoutManager.VERTICAL, false
        )
        newsListAdapter = NewsListAdapter()
        recyclerView.adapter = newsListAdapter
    }

    override fun getLayoutId() = R.layout.activity_main

    override fun createViewModel() = MainActivityViewModel::class.java

    override fun subscribeToObservers() {
        viewModel.newsListLiveData.observe(this, Observer {
            newsListAdapter.setData(it)
            newsListAdapter.notifyDataSetChanged()
        })
    }
}