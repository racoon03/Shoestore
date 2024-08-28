package com.example.shoestore.mapper;

import com.example.shoestore.dto.BrandDto;
import com.example.shoestore.entity.Brand;

public class BrandMapper {

    // Phương thức chuyển đổi từ Entity sang DTO
    public static BrandDto MapToBrandDto(Brand brand) {
        return new BrandDto(
                brand.getBrandId(),
                brand.getBrandName()
        );
    }

    // Phương thức chuyển đổi từ DTO sang Entity
    public static Brand MapToBrand(BrandDto brandDto) {
        return new Brand(
                brandDto.getBrandId(),
                brandDto.getBrandName()
        );
    }
}
