package com.shopBot.shopBotProducts.service;

import com.shopBot.shopBotProducts.entity.Product;
import com.shopBot.shopBotProducts.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository prodcutRepo;

    @Override
    public List<Product> getAllProducts() {
        System.out.println("Fetching all prodcuts");
        return prodcutRepo.findAll();
    }

    @Override
    public Product getProductDetails(String productId) {
        System.out.println("Fetching product details");
        return prodcutRepo.findOneByProductId(productId);
    }

    @Override
    public void addProduct(Product product) {
        System.out.println("Adding product...");
        prodcutRepo.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("Update products...");
        prodcutRepo.save(product);
    }

    @Override
    public void deleteProduct(String productId) {
        System.out.println("Deleting product...");
        prodcutRepo.deleteById(productId);
    }
}
