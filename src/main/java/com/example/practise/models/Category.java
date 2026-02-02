package com.example.practise.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {

    private int id;
    private String categoryName;

    public Category(int id, String categoryName){
        this.id = id;
        this.categoryName = categoryName;
    }

    public Category(){

    }

}
