package com.example.productsapi.controller

import com.example.productsapi.model.Product
import com.example.productsapi.model.ProductId
import com.example.productsapi.repository.ProductRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/products")
class ProductController(private val productRepository: ProductRepository) {

    @GetMapping
    fun getAll(): List<Product> = productRepository.findAll()

    @GetMapping("/{commercialReference}")
    fun getByReference(@PathVariable commercialReference: String): List<Product> =
        productRepository.findByCommercialReference(commercialReference)

    @GetMapping("/{commercialReference}/{colorCode}")
    fun getByReferenceAndColor(
        @PathVariable commercialReference: String,
        @PathVariable colorCode: String
    ): ResponseEntity<Product> {
        val id = ProductId(commercialReference, colorCode)
        return productRepository.findById(id)
            .map { ResponseEntity.ok(it) }
            .orElse(ResponseEntity.notFound().build())
    }
}
