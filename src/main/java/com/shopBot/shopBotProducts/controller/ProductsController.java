package com.shopBot.shopBotProducts.controller;

import com.shopBot.shopBotProducts.entity.Product;
import com.shopBot.shopBotProducts.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value="ShopBot application", description="Operations pertaining to products in Online through chat")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products")
    @ApiOperation(value = "View a list of available products")
    public List<Product> getAllProdcuts(){
        return productService.getAllProducts();
    }

    @GetMapping(value = "/products/{productId}")
    @ApiOperation(value = "View a particular product")
    public Product getAllProdcuts(@PathVariable("productId") String productId){
        return productService.getProductDetails(productId);
    }

    @PostMapping(value = "/products")
    @ApiOperation(value = "Add a product to the inventory")
    public String addProduct(@RequestBody Product product){
         productService.addProduct(product);
         return "product added Successfully";
    }

    @PutMapping(value = "/products")
    @ApiOperation(value = "Update a product to the inventory")
    public String updateProduct(@RequestBody Product product){
         productService.updateProduct(product);
        return "product Updated Successfully";
    }

    @DeleteMapping(value = "/products")
    @ApiOperation(value = "Delete a product from inventory")
    public String deleteProduct(String productId){
         productService.deleteProduct(productId);
         return "product deleted Successfully";
    }
}
