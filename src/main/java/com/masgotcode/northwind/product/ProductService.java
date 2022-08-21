package com.masgotcode.northwind.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public List<String> getCategoriesFromProducts(){
        log.info("ProductService.getCategoriesFromProducts");
        List<String> categories = productRepository.findAll().stream()
                .map(Product::getCategoryName)
                .distinct()
                .collect(Collectors.toList());

        categories.forEach(System.out::println);

        return categories;
    }
}
