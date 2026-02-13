package com.example.practise.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category extends BaseModel{

    private String categoryName;

    public Category(String categoryName){
        this.categoryName = categoryName;
    }

    public Category(){

    }

}
