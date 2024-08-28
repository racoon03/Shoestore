package com.example.shoestore.mapper;

import com.example.shoestore.dto.CategoryDto;
import com.example.shoestore.entity.Category;

import java.util.stream.Collectors;

public class CategoryMapper {

    // Phương thức chuyển đổi từ Entity sang DTO
    public static CategoryDto mapToCategoryDto(Category category) {
        return new CategoryDto(
                category.getCategoryId(),
                category.getCategoryName()
        );
    }

    // Phương thức chuyển đổi từ DTO sang Entity
    public static Category mapToCategory(CategoryDto categoryDto) {
        Category category = new Category();
        category.setCategoryId(categoryDto.getCategoryId());
        category.setCategoryName(categoryDto.getCategoryName());
        return category;
    }
}
