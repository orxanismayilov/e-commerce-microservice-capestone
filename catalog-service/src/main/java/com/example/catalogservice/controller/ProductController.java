package com.example.catalogservice.controller;

import com.example.catalogservice.domain.dto.ProductDTO;
import com.example.catalogservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/sku/{sku}")
    public ResponseEntity<List<ProductDTO>> getProductsBySKU(@PathVariable String sku, Pageable pageable) {
        return ResponseEntity.ok(productService.getProductsBySKU(sku,pageable));
    }

    @GetMapping("/{uniqId}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable String uniqId) {
        return ResponseEntity.ok(productService.getProductById(uniqId));
    }
}
