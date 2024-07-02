package com.example.splash_screen.models

import com.bumptech.glide.load.model.GlideUrl

data class CategoryModel(
    val name : String,
    val coverUrl: String,
){
    constructor() : this("","")
}
