package com.example.hellospring.services;

import com.example.hellospring.models.Product;
import com.example.hellospring.repository.ProductRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // declare dia sebagai service
@RequiredArgsConstructor // auto create constructor and inject dependency // lombok auto create constructor for us
public class ProductServiceImpl implements ProductService {
    final ProductRepository productRepository;
    // Create
    public Product createProduct(Product newProduct){
        return productRepository.save(newProduct);
    }
    // Read
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    // ReadByID

    // U

    // D
}
