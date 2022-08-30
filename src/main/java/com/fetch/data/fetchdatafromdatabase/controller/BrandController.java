package com.fetch.data.fetchdatafromdatabase.controller;

import com.fetch.data.fetchdatafromdatabase.model.Brand;
import com.fetch.data.fetchdatafromdatabase.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrandController {

    private BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping(path = "getBrandData")
    public List<Brand> getAllBrandData() {
        return brandService.getAllBrands();
    }
}
