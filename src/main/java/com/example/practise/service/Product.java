package com.example.practise.service;

import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private long id;
    private String title;
    private double price;
    private String description;
    private Category category;
    private String imageURL;

    public Product(long id, String title, double price, String description, Category category, String imageURL){
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.imageURL = imageURL;
    }

    public Product(){

    }

}
