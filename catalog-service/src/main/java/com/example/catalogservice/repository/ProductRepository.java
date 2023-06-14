package com.example.catalogservice.repository;

import com.example.catalogservice.domain.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {

    List<Product> findAllBySku(String sku, Pageable pageable);
}
