package com.example.shoestore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Shoe") // Đảm bảo tên bảng khớp với tên trong CSDL
public class Shoe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ShoeID", nullable = false)
    private int shoeId; // Tương ứng với ProductID trong CSDL

    @Column(name = "ShoeName", nullable = false)
    private String shoeName;

    @ManyToOne
    @JoinColumn(name = "BrandID")
    private Brand brand; // Tạo một lớp Brand để ánh xạ khóa ngoại

    @ManyToOne
    @JoinColumn(name = "CategoryID")
    private Category category; // Tạo một lớp Category để ánh xạ khóa ngoại

    @Column(name = "Price", nullable = false)
    private BigDecimal price;

    @Column(name = "Stock", nullable = false)
    private int stock;

    @Column(name = "Description")
    private String description;

    @Column(name = "ImageURL")
    private String imageURL;
}
