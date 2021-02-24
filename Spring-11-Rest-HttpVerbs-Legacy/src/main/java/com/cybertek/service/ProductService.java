package com.cybertek.service;

import com.cybertek.entity.Product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getProducts();
    List<Product> delete(long id);
    List<Product> updateProduct(long id);
    List<Product> createProduct(Product product);
    List<Product> getProduct(long id);

}
