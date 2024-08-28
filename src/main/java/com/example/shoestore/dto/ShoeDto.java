package com.example.shoestore.dto;

import com.example.shoestore.entity.Brand;
import com.example.shoestore.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShoeDto {
    private int shoeId;
    private String shoeName;
    private int brand;
    private int category;
    private BigDecimal price;
    private int stock;
    private String description;
    private String imageURL;
}
