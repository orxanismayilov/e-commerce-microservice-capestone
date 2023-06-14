package com.example.catalogservice.service.impl;

import com.example.catalogservice.domain.dto.ProductDTO;
import com.example.catalogservice.domain.mapper.ProductMapper;
import com.example.catalogservice.exception.ApiException;
import com.example.catalogservice.repository.ProductRepository;
import com.example.catalogservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductDTO getProductById(String productId) {
        return ProductMapper.INSTANCE.toDTO(productRepository.findById(productId)
                .orElseThrow(() -> new ApiException(String.format("Product with %s not found.", productId))));
    }

    public List<ProductDTO> getProductsBySKU(String sku, Pageable pageable) {
        return ProductMapper.INSTANCE.toDTOs(productRepository.findAllBySku(sku, pageable));
    }
}
