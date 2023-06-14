package com.example.inventoryservice.repository;

import com.example.inventoryservice.domain.model.Availability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvailabilityRepository extends JpaRepository<Availability, String> {

    List<Availability> findAllByUniqIdIn(List<String> uniqIds);
}
