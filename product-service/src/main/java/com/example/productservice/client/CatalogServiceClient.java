package com.example.productservice.client;

import com.example.catalogcommon.domain.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "${feign.catalog-service}" )
public interface CatalogServiceClient {

    @GetMapping("/catalog/sku/{sku}")
    ResponseEntity<List<ProductDTO>> getProductsBySKU(@PathVariable String sku, Pageable pageable);

    @GetMapping("/catalog/{uniqId}")
    ResponseEntity<ProductDTO> getProductById(@PathVariable String uniqId);
}
