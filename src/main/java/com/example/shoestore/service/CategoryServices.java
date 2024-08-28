package com.example.shoestore.service;

import com.example.shoestore.dto.BrandDto;
import com.example.shoestore.dto.CategoryDto;
import com.example.shoestore.dto.ShoeDto;
import com.example.shoestore.entity.Brand;
import com.example.shoestore.entity.Category;


public interface CategoryServices {
    CategoryDto createCategory(CategoryDto CategoryDto);
}
