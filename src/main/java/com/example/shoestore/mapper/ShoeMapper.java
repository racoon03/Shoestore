package com.example.shoestore.mapper;

import com.example.shoestore.dto.ShoeDto;
import com.example.shoestore.entity.Brand;
import com.example.shoestore.entity.Category;
import com.example.shoestore.entity.Shoe;

public class ShoeMapper {
    // Phương thức chuyển đổi từ Entity sang DTO
    public static ShoeDto MaptoShoeDto(Shoe shoe) {
        return new ShoeDto(
                shoe.getShoeId(),
                shoe.getShoeName(),
                shoe.getBrand().getBrandId(), // Lấy ID thay vì đối tượng
                shoe.getCategory().getCategoryId(), // Lấy ID thay vì đối tượng
                shoe.getPrice(),
                shoe.getStock(),
                shoe.getDescription(),
                shoe.getImageURL()
        );
    }

    // Phương thức chuyển đổi từ DTO sang Entity
    public static Shoe MaptoShoe(ShoeDto shoeDto, Brand brand, Category category) {
        return new Shoe(
                shoeDto.getShoeId(),
                shoeDto.getShoeName(),
                brand, // Truyền đối tượng Brand đầy đủ
                category, // Truyền đối tượng Category đầy đủ
                shoeDto.getPrice(),
                shoeDto.getStock(),
                shoeDto.getDescription(),
                shoeDto.getImageURL()
        );
    }
}
