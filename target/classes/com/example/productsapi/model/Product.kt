package com.example.productsapi.model

import jakarta.persistence.*

@Entity
@Table(name = "products")
@IdClass(ProductId::class)
class Product(
    @Id
    @Column(name = "commercial_reference", length = 64)
    val commercialReference: String = "",

    @Column(name = "style_description", nullable = false)
    val styleDescription: String = "",

    @Column(name = "image_url", columnDefinition = "TEXT")
    val imageUrl: String = "[]",

    @Id
    @Column(name = "color_code", length = 64)
    val colorCode: String = "",

    @Column(name = "color_rgb", length = 64)
    val colorRgb: String = "",

    @Column(name = "available_sizes", columnDefinition = "TEXT")
    val availableSizes: String = "[]",

    @Column(name = "available_colors", columnDefinition = "TEXT")
    val availableColors: String = "[]"
)
