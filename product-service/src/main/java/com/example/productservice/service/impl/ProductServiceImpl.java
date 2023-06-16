package com.example.productservice.service.impl;

import com.example.catalogcommon.domain.dto.AvailabilityDTO;
import com.example.catalogcommon.domain.dto.ProductDTO;
import com.example.productservice.client.AvailabilityServiceClient;
import com.example.productservice.client.CatalogServiceClient;
import com.example.productservice.domain.model.ProductDetail;
import com.example.productservice.service.ProductService;
import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final CatalogServiceClient catalogServiceClient;
    private final AvailabilityServiceClient availabilityServiceClient;

    @Override
    public ProductDetail getProductDetailByUniqId(String uniqId) {
        ResponseEntity<ProductDTO> product = catalogServiceClient.getProductById(uniqId);
        ResponseEntity<List<AvailabilityDTO>> productsAvailabilitiesByProductIds = availabilityServiceClient.getProductsAvailabilitiesByProductIds(Collections.singletonList(uniqId));
        return null;
    }

    @Override
    public List<ProductDetail> getProductDetailsBySKU(String sku) {
        return null;
    }
}
