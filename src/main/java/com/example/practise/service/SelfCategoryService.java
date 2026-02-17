package com.example.practise.service;

import com.example.practise.dto.CreateCategoryDTO;
import com.example.practise.dto.GetCategoryDTO;
import com.example.practise.models.Category;
import com.example.practise.repositories.CategoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SelfCategoryService implements CategoryService{

    public CategoryRepository categoryRepository;

    public SelfCategoryService (CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    private Category createCategoryFromDTO (CreateCategoryDTO createCategoryDTO){
        Category category = new Category();
        category.setCategoryName(createCategoryDTO.getCategory_name());
        return category;
    }

    private GetCategoryDTO createCategoryResponse(Category category){
        GetCategoryDTO getCategoryDTO = new GetCategoryDTO();
        getCategoryDTO.setCategory_name(category.getCategoryName());
        return getCategoryDTO;
    }

    public GetCategoryDTO createCategory(CreateCategoryDTO createCategoryDTO){
        Category category = categoryRepository.save(createCategoryFromDTO(createCategoryDTO));
        return createCategoryResponse(category);
    }

}
