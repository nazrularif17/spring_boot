package com.example.hellospring.services;

import com.example.hellospring.models.Product;

import java.util.List;

// Inside interface. listkan semua method yg ada dalam implementation
public interface ProductService {
    public Product createProduct(Product newProduct);
    public List<Product> getAllProduct();
}
