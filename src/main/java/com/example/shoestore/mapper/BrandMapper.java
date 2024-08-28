package com.example.shoestore.mapper;

import com.example.shoestore.dto.BrandDto;
import com.example.shoestore.dto.CategoryDto;
import com.example.shoestore.entity.Brand;
import com.example.shoestore.entity.Category;

import java.util.stream.Collectors;

public class BrandMapper {

    // Phương thức chuyển đổi từ Entity sang DTO
    public static BrandDto MapToBrandDto(Brand brand) {
        return new BrandDto(
                brand.getBrandId(),
                brand.getBrandName()
        );
    }

    // Phương thức chuyển đổi từ DTO sang Entity
    public static Brand mapToBrand(BrandDto BrandDto) {
        Brand brand = new Brand();
        brand.setBrandId(BrandDto.getBrandId());
        brand.setBrandName(BrandDto.getBrandName());
        return brand;
    }
}
