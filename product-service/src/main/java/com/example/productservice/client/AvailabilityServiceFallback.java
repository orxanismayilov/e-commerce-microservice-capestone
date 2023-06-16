package com.example.productservice.client;

import com.example.catalogcommon.domain.dto.AvailabilityDTO;
import com.example.catalogcommon.exception.ApiException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AvailabilityServiceFallback implements AvailabilityServiceClient{

    @Override
    public ResponseEntity<List<AvailabilityDTO>> getProductsAvailabilitiesByProductIds(List<String> uniqId) {
        throw new ApiException("Availability Service is not available.");
    }
}
