package com.example.practise.controller;

import com.example.practise.dto.CreateCategoryDTO;
import com.example.practise.dto.GetCategoryDTO;
import com.example.practise.service.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryService categoryService;
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping()
    private GetCategoryDTO createCategory(@RequestBody CreateCategoryDTO createCategoryDTO){
        return categoryService.createCategory(createCategoryDTO);
    }

}
