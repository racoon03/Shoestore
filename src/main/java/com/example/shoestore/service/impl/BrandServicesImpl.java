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
import com.example.shoestore.service.ShoeServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrandServicesImpl implements BrandServices{

    private BrandRepository BrandRepository;


    @Override
    public BrandDto createBrand(BrandDto BrandDto) {
        Brand brand = BrandMapper.mapToBrand(BrandDto);
        Brand savedBrand = BrandRepository.save(brand);
        return BrandMapper.MapToBrandDto(savedBrand);
    }


}
