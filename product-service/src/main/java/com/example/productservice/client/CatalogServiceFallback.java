package com.example.productservice.client;

import com.example.catalogcommon.domain.dto.ProductDTO;
import com.example.catalogcommon.exception.ApiException;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CatalogServiceFallback implements CatalogServiceClient {
    @Override
    public ResponseEntity<List<ProductDTO>> getProductsBySKU(String sku, Pageable pageable) {
        throw new ApiException("Catalog Service is not available.");
    }

    @Override
    public ResponseEntity<ProductDTO> getProductById(String uniqId) {
        throw new ApiException("Catalog Service is not available.");
    }
}
