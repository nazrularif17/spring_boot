package com.example.hellospring.controllers;

import com.example.hellospring.models.Product;
import com.example.hellospring.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // ini adalah API!!!!!
@RequestMapping("/products") // ini adalah URL dia
@RequiredArgsConstructor
public class ProductController {
    final ProductService productService;
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }
}
