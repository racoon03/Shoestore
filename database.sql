create database shoestore;
use shoestore;


CREATE TABLE Brands (
    BrandID INT AUTO_INCREMENT PRIMARY KEY,
    BrandName VARCHAR(255) NOT NULL
);

CREATE TABLE Categories (
    CategoryID INT AUTO_INCREMENT PRIMARY KEY,
    CategoryName VARCHAR(255) NOT NULL
);

-- Tạo bảng để lưu trữ thông tin sản phẩm
CREATE TABLE Shoe (
    ShoeID INT AUTO_INCREMENT PRIMARY KEY,
    ShoeName VARCHAR(255) NOT NULL,
    BrandID INT,
    CategoryID INT,
    Price DECIMAL(10, 2) NOT NULL,
    Stock INT NOT NULL DEFAULT 0,
    Description TEXT,
    ImageURL VARCHAR(255),
    FOREIGN KEY (BrandID) REFERENCES Brands(BrandID),
    FOREIGN KEY (CategoryID) REFERENCES Categories(CategoryID)
);

-- Tạo bảng để lưu trữ thông tin khách hàng
CREATE TABLE Users (
    UserID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(255) NOT NULL,
    LastName VARCHAR(255) NOT NULL,
    Email VARCHAR(255) UNIQUE NOT NULL,
    Phone VARCHAR(20),
    Address TEXT
);

-- Tạo bảng để lưu trữ thông tin đơn hàng
CREATE TABLE Orders (
    OrderID INT AUTO_INCREMENT PRIMARY KEY,
    UserID INT,
    OrderDate DATE,
    TotalAmount DECIMAL(10, 2),
    FOREIGN KEY (UserID) REFERENCES Users(UserID)
);

-- Tạo bảng để lưu trữ chi tiết đơn hàng
CREATE TABLE OrderDetails (
    OrderDetailID INT AUTO_INCREMENT PRIMARY KEY,
    OrderID INT,
    ShoeID INT,
    Quantity INT NOT NULL,
    Price DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    FOREIGN KEY (ShoeID) REFERENCES Shoe(ShoeID)
);

CREATE TABLE roles (
  role_id int NOT NULL AUTO_INCREMENT,
  role_name varchar(50) NOT NULL,
   PRIMARY KEY (role_id)
);

-- Tạo bảng để lưu trữ thông tin tài khoản khách hàng
CREATE TABLE Accounts (
    AccountID INT AUTO_INCREMENT PRIMARY KEY,
    UserID INT NOT NULL,
    Username VARCHAR(255) UNIQUE NOT NULL,
    Password VARCHAR(255) NOT NULL,
    RoleID INT NOT NULL,
    FOREIGN KEY (UserID) REFERENCES Users(UserID),
    FOREIGN KEY (RoleID) REFERENCES roles(role_id)
);