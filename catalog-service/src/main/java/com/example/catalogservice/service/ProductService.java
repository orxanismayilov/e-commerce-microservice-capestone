package com.example.catalogservice.service;

import com.example.catalogservice.domain.dto.ProductDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    ProductDTO getProductById(String productId);

    List<ProductDTO> getProductsBySKU(String sku, Pageable pageable);
}
