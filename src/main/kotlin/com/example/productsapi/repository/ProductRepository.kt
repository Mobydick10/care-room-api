package com.example.productsapi.repository

import com.example.productsapi.model.Product
import com.example.productsapi.model.ProductId
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, ProductId> {
    fun findByCommercialReference(commercialReference: String): List<Product>
}
