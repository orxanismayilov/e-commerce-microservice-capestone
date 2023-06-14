package com.example.productservice.service.impl;

import com.example.productservice.domain.model.ProductDetail;
import com.example.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {


    @Override
    public ProductDetail getProductDetailByUniqId(String uniqId) {
        return null;
    }

    @Override
    public List<ProductDetail> getProductDetailsBySKU(String sku) {
        return null;
    }
}
