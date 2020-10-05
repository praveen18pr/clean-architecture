package com.praveen.cleanarchitecture.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.praveen.cleanarchitecture.BR
import com.praveen.cleanarchitecture.R
import com.praveen.cleanarchitecture.databinding.LayoutNewsItemBinding
import com.praveen.cleanarchitecture.interfaces.ItemClickListener
import com.praveen.domain.NewsArticle

class NewsListAdapter : RecyclerView.Adapter<NewsListAdapter.ViewHolder>(),
    ItemClickListener<NewsArticle> {

    private  var data: List<NewsArticle> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: LayoutNewsItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.layout_news_item, parent, false
        )
        //LayoutInflater.from(parent.context).inflate(R.layout.layout_news_item, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: NewsArticle = data[position]
        holder.bind(item)
        holder.setItemClickListener()
    }

    inner class ViewHolder(private val layoutNewsItemBinding: LayoutNewsItemBinding) :
        RecyclerView.ViewHolder(layoutNewsItemBinding.root) {

        fun bind(item: NewsArticle) {
            layoutNewsItemBinding.setVariable(BR.article, item)
            layoutNewsItemBinding.executePendingBindings()
//            layoutNewsItemBinding.article = item
        }

        fun setItemClickListener() {
            layoutNewsItemBinding.itemClickListener = this@NewsListAdapter
        }
    }

    override fun onItemClick(item: NewsArticle) {
        println("item clicked")
    }

    fun setData(data: List<NewsArticle>) {
        this.data = data
    }
}