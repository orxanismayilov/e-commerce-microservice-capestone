package com.example.inventoryservice.domain.mapper;

import com.example.inventoryservice.domain.DTO.AvailabilityDTO;
import com.example.inventoryservice.domain.model.Availability;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AvailabilityMapper {

    AvailabilityMapper INSTANCE = Mappers.getMapper(AvailabilityMapper.class);

    List<AvailabilityDTO> toDTOs(List<Availability> availabilities);

}
