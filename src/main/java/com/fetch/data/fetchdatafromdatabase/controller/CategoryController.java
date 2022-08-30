package com.fetch.data.fetchdatafromdatabase.controller;


import com.fetch.data.fetchdatafromdatabase.model.Category;
import com.fetch.data.fetchdatafromdatabase.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(path = "getAllCategoriesData")
    public List<Category> getAllCategoriesData() {
        return categoryService.getAllCategories();
    }
}
