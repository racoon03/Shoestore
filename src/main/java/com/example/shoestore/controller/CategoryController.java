package com.example.shoestore.controller;

import com.example.shoestore.dto.CategoryDto;
import com.example.shoestore.service.ShoeServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.shoestore.service.CategoryServices;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private CategoryServices CategoryServices;

    @PostMapping
    public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto){
        CategoryDto savedCategory = CategoryServices.createCategory(categoryDto);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }

}
