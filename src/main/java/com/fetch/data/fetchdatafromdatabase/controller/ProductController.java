package com.fetch.data.fetchdatafromdatabase.controller;

import com.fetch.data.fetchdatafromdatabase.model.Products;
import com.fetch.data.fetchdatafromdatabase.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "getAllProducts")
    public List<Products> getAllProducts() {
        return productService.getAllProducts();
    }
}
