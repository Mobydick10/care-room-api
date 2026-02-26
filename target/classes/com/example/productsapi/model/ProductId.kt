package com.example.productsapi.model

import java.io.Serializable

data class ProductId(
    val commercialReference: String = "",
    val colorCode: String = ""
) : Serializable
