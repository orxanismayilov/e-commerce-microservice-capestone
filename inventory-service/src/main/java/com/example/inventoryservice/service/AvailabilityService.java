package com.example.inventoryservice.service;

import com.example.inventoryservice.domain.DTO.AvailabilityDTO;

import java.util.List;

public interface AvailabilityService {

    List<AvailabilityDTO> getProductAvailabilitiesByProductIds(List<String> productIds);
}
