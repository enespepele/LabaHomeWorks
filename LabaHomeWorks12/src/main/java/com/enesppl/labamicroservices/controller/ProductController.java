package com.enesppl.labamicroservices.controller;

import com.enesppl.labamicroservices.service.ProductService;
import lombok.AllArgsConstructor;
import com.enesppl.labamicroservices.dto.ProductDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/products")
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
    private ProductService productService;

    // build create Product REST API
    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto product){
        ProductDto savedProduct = productService.createProduct(product);
        logger.info("*******************Product Created*********************");
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);

    }


    // http://localhost:9090/api/products/1
    @GetMapping("{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable("id") Long productId){
        ProductDto product = productService.getProductById(productId);
        logger.info("product is showed");
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    // Build Get All products REST API
    // http://localhost:9090/api/products/1
    @GetMapping
    public ResponseEntity<List<ProductDto>> getAllProducts(){
        List<ProductDto> products = productService.getAllProducts();
        logger.info("Products are Showed");
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    // Build Update product REST API
    @PutMapping("{id}")
    // http://localhost:9090/api/products/1
    public ResponseEntity<ProductDto> updateProduct(@PathVariable("id") Long productId,
                                                    @RequestBody ProductDto product){
        product.setId(productId);
        ProductDto updatedProduct = productService.updateProducts(product);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }

    // Build Delete Product REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") Long productId){
        productService.deleteProducts(productId);
        return new ResponseEntity<>("Product successfully deleted!", HttpStatus.OK);
    }
}
