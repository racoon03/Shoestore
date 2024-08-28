package com.example.shoestore.controller;

import com.example.shoestore.dto.BrandDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.shoestore.service.BrandServices;


@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/brands")
public class BrandController {
    private BrandServices BrandServices;

    @PostMapping
    public ResponseEntity<BrandDto> createBrand(@RequestBody BrandDto brandDto){
        BrandDto savedBrand = BrandServices.createBrand(brandDto);
        return new ResponseEntity<>(savedBrand, HttpStatus.CREATED);
    }

}
