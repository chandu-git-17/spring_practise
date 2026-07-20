package com.example.practise.dto;

import com.example.practise.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasicProductListDTO {

    private long id;
    private String title;
    private String categoryName;

}
