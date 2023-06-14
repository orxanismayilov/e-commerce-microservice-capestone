package com.example.productservice.service;

import com.example.productservice.domain.model.ProductDetail;

import java.util.List;

public interface ProductService {
    ProductDetail getProductDetailByUniqId(String uniqId);

    List<ProductDetail> getProductDetailsBySKU(String sku);
}
