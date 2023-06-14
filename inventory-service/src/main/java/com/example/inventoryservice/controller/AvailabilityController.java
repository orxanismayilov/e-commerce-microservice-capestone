package com.example.inventoryservice.controller;

import com.example.inventoryservice.domain.DTO.AvailabilityDTO;
import com.example.inventoryservice.service.AvailabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/availability")
@RequiredArgsConstructor
public class AvailabilityController {

    private final AvailabilityService availabilityService;

    @GetMapping
    public ResponseEntity<List<AvailabilityDTO>> getProductsAvailabilitiesByProductIds(@RequestParam List<String> uniqId) {
        return ResponseEntity.ok(availabilityService.getProductAvailabilitiesByProductIds(uniqId));
    }
}
