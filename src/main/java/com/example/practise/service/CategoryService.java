package com.example.practise.service;

import com.example.practise.dto.CreateCategoryDTO;
import com.example.practise.dto.GetCategoryDTO;

public interface CategoryService {

    public GetCategoryDTO createCategory(CreateCategoryDTO createCategoryDTO);

}
