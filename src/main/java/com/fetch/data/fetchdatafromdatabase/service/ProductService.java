package com.fetch.data.fetchdatafromdatabase.service;

import com.fetch.data.fetchdatafromdatabase.model.Products;
import com.fetch.data.fetchdatafromdatabase.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }
}
