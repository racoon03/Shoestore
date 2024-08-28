package com.example.shoestore.service.impl;

import com.example.shoestore.dto.BrandDto;
import com.example.shoestore.dto.CategoryDto;
import com.example.shoestore.dto.ShoeDto;
import com.example.shoestore.entity.Brand;
import com.example.shoestore.entity.Category;
import com.example.shoestore.entity.Shoe;
import com.example.shoestore.mapper.BrandMapper;
import com.example.shoestore.mapper.CategoryMapper;
import com.example.shoestore.mapper.ShoeMapper;
import com.example.shoestore.repository.BrandRepository;
import com.example.shoestore.repository.CategoryRepository;
import com.example.shoestore.repository.ShoeRepository;
import com.example.shoestore.service.BrandServices;
import com.example.shoestore.service.CategoryServices;
import com.example.shoestore.service.ShoeServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryServicesImpl implements CategoryServices {

    private CategoryRepository CategoryRepository;

    @Override
    public CategoryDto createCategory(CategoryDto CategoryDto) {
        Category category = CategoryMapper.MapToCategory(CategoryDto);
        Category savedCategory = CategoryRepository.save(category);
        return CategoryMapper.MapToCategoryDto(savedCategory);
    }
}
