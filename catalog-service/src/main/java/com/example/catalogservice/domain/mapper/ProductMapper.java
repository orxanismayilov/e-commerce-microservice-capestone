package com.example.catalogservice.domain.mapper;

import com.example.catalogservice.domain.dto.ProductDTO;
import com.example.catalogservice.domain.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDTO(Product product);

    List<ProductDTO> toDTOs(List<Product> product);
    Product toEntity(ProductDTO productDTO);
}
