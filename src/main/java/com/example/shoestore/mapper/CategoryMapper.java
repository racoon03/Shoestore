package com.example.shoestore.mapper;

import com.example.shoestore.dto.CategoryDto;
import com.example.shoestore.entity.Category;

public class CategoryMapper {

    // Phương thức chuyển đổi từ Entity sang DTO
    public static CategoryDto MapToCategoryDto(Category category) {
        return new CategoryDto(
                category.getCategoryId(),
                category.getCategoryName()
        );
    }

    // Phương thức chuyển đổi từ DTO sang Entity
    public static Category MapToCategory(CategoryDto categoryDto) {
        return new Category(
                categoryDto.getCategoryId(),
                categoryDto.getCategoryName()
        );
    }
}
