package com.example.practise.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientToProduct {

    private String title;
    private Double price;
    private String description;
    private Long category;
    private String imageURL;

}
