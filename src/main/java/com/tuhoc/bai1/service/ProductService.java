package com.tuhoc.bai1.service;

import com.tuhoc.bai1.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    void deleteById(int id);
}
