package com.example.inventoryservice.service.impl;

import com.example.inventoryservice.domain.DTO.AvailabilityDTO;
import com.example.inventoryservice.domain.mapper.AvailabilityMapper;
import com.example.inventoryservice.repository.AvailabilityRepository;
import com.example.inventoryservice.service.AvailabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvailabilityServiceImpl implements AvailabilityService {

    private final AvailabilityRepository availabilityRepository;

    @Override
    public List<AvailabilityDTO> getProductAvailabilitiesByProductIds(List<String> productIds) {
        return AvailabilityMapper.INSTANCE.toDTOs(availabilityRepository.findAllByUniqIdIn(productIds));
    }
}
