package com.example.practise.dto;

import com.example.practise.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientToProduct {

    private String title;
    private Double price;
    private String description;
    private Long categoryId;
    private String imageURL;

}
