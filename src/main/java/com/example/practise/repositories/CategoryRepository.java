package com.example.practise.repositories;

import com.example.practise.dto.GetCategoryDTO;
import com.example.practise.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category save(Category category);

}
