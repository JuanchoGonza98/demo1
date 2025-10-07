package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getAllProducts() {
        return Arrays.asList(
                new Product(1L, "Mancuerna", 250000),
                new Product(2L, "Esterilla", 120000),
                new Product(3L, "Cinturón de levantamiento", 180000)
        );
    }
}

