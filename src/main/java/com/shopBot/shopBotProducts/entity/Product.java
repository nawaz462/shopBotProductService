package com.shopBot.shopBotProducts.entity;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "product")
public class Product implements Serializable{

    public Product() {
    }

    public Product(String productId, String name, String brand, String size, String category, String color) {
        this.productId = productId;
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.category = category;
        this.color = color;
    }

    @ApiModelProperty(notes = " product Id")
    private String productId;
    @ApiModelProperty(notes = " product name")
    private String name;
    @ApiModelProperty(notes = " product brand")
    private String brand;
    @ApiModelProperty(notes = " product size")
    private String size;
    @ApiModelProperty(notes = " product category")
    private String category;
    @ApiModelProperty(notes = " product color")
    private String color;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
