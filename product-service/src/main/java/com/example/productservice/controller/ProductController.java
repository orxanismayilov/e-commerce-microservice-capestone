package com.example.productservice.controller;

import com.example.productservice.domain.model.ProductDetail;
import com.example.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/{uniqId}")
    public ResponseEntity<ProductDetail> getProductDetailByUniqId(@PathVariable String uniqId) {
        return ResponseEntity.ok(productService.getProductDetailByUniqId(uniqId));
    }

    @GetMapping("/sku/{sku}")
    public ResponseEntity<List<ProductDetail>> getProductDetailsBySKU(@PathVariable String sku) {
        return ResponseEntity.ok(productService.getProductDetailsBySKU(sku));
    }
}
