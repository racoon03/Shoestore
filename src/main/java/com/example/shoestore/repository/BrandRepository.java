package com.example.shoestore.repository;

import com.example.shoestore.entity.Brand;
import com.example.shoestore.entity.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
