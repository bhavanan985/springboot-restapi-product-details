package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
public class ProductService {
	private List<Product> productList = new ArrayList<>();

    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }

    public List<Product> getAllProducts() {
        return productList;
    }

}
