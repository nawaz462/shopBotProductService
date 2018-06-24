package com.shopBot.shopBotProducts.repository;

import com.shopBot.shopBotProducts.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product,String>{

    Product findOneByProductId(String productId);
}
