package com.example.shoestore.repository;

import com.example.shoestore.entity.Category;
import com.example.shoestore.entity.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
