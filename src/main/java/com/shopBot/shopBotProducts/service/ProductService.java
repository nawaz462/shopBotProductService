package com.shopBot.shopBotProducts.service;

import com.shopBot.shopBotProducts.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getAllProducts();

    Product getProductDetails(String productId);

    void addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(String productId);
}
