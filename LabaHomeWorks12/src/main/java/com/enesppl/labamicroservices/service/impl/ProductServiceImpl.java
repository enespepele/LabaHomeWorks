package com.enesppl.labamicroservices.service.impl;

import com.enesppl.labamicroservices.entity.Product;
import com.enesppl.labamicroservices.mapper.AutoProductMapper;
import com.enesppl.labamicroservices.service.ProductService;
import lombok.AllArgsConstructor;
import com.enesppl.labamicroservices.dto.ProductDto;
import com.enesppl.labamicroservices.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    private ModelMapper modelMapper;

    @Override
    public ProductDto createProduct(ProductDto productDto) {



        Product product = AutoProductMapper.MAPPER.mapToProduct(productDto);

        Product savedProduct = productRepository.save(product);


        ProductDto savedProductDto = AutoProductMapper.MAPPER.maptToProductDto(savedProduct);

        return savedProductDto;
    }

    @Override
    public ProductDto getProductById(Long productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        Product product = optionalProduct.get();

        return AutoProductMapper.MAPPER.maptToProductDto(optionalProduct.get());
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();


        return products.stream().map((product) -> AutoProductMapper.MAPPER.maptToProductDto(product)).collect(Collectors.toList());
    }

    @Override
    public ProductDto updateProducts(ProductDto productDto) {
        Product existingProduct = productRepository.findById(productDto.getId()).get();
        existingProduct.setName(productDto.getName());
        existingProduct.setCategory(productDto.getCategory());
        existingProduct.setPhotoUrl(productDto.getPhotoUrl());
        existingProduct.setPhotoUrl(productDto.getDescription());
        existingProduct.getPrice();
        Product updatedProduct = productRepository.save(existingProduct);

        return AutoProductMapper.MAPPER.maptToProductDto(updatedProduct);
    }

    @Override
    public void deleteProducts(Long productId) {
        productRepository.deleteById(productId);
    }
}
