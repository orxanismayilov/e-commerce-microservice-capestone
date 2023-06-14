package com.example.productservice.client;

import com.example.catalogcommon.domain.dto.AvailabilityDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "${feign.inventory-service}" )
public interface AvailabilityServiceClient {

    @GetMapping("/availability")
    ResponseEntity<List<AvailabilityDTO>> getProductsAvailabilitiesByProductIds(@RequestParam List<String> uniqId);
}
