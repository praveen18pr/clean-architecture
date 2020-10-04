package com.praveen.data.models


data class NewsResponse(
    val status: String,
    val results: List<NewsArticle>
)

data class NewsArticle(
    val type: String? = null,
    val title: String? = null,
)