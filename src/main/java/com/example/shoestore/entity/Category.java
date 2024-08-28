package com.example.shoestore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Categories")

public class Category {
    @Id
    private int CategoryId;
    @Column(name = "CategoryName")
    private String CategoryName;
}
