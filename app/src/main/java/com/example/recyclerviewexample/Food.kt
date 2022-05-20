package com.example.recyclerviewexample

data class Food (
    val id: Int,
    val title: String,
    val subTitle: String,
    val isRated: Boolean,
    val ratingCount: Int,
    val reviewCount: Int,
    val imgRes: Int
)