package com.example.practise.controller;

import com.example.practise.dto.CreateCategoryDTO;
import com.example.practise.dto.GetCategoryDTO;
import com.example.practise.models.Category;
import com.example.practise.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping()
    private List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

}
