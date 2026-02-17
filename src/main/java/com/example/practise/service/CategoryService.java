package com.example.practise.service;

import com.example.practise.dto.CreateCategoryDTO;
import com.example.practise.dto.GetCategoryDTO;
import com.example.practise.models.Category;

import java.util.List;

public interface CategoryService {

    public GetCategoryDTO createCategory(CreateCategoryDTO createCategoryDTO);
    public List<Category> getAllCategories();
}
