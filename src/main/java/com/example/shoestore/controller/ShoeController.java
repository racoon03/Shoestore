package com.example.shoestore.controller;

import com.example.shoestore.dto.BrandDto;
import com.example.shoestore.dto.CategoryDto;
import com.example.shoestore.dto.ShoeDto;
import com.example.shoestore.entity.Brand;
import com.example.shoestore.entity.Category;
import com.example.shoestore.entity.Shoe;
import com.example.shoestore.service.ShoeServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/shoes")
public class ShoeController {
    private ShoeServices ShoeServices;

    @PostMapping
    public ResponseEntity<ShoeDto> createShoe(@RequestBody ShoeDto ShoeDto, Brand Brand, Category Category){
        ShoeDto savedShoe = ShoeServices.createShoe(ShoeDto, Brand, Category);
        return new ResponseEntity<>(savedShoe, HttpStatus.CREATED);
    }


}
