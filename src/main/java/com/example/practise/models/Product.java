package com.example.practise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel{

    private String title;
    private double price;
    private String description;
    @ManyToOne
    private Category category;
    private String imageURL;

    public Product(String title, double price, String description, Category category, String imageURL){
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.imageURL = imageURL;
    }


    public Product() {

    }
}
