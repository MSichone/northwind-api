package com.masgotcode.northwind.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    private final Logger log = LoggerFactory.getLogger(ProductService.class);
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<Product> getAllProducts(){
        log.info("ProductService.getAllProducts");
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id){
        log.info("ProductService.getProductById["+id+"]");
        return productRepository.findById(id);
    }
}
