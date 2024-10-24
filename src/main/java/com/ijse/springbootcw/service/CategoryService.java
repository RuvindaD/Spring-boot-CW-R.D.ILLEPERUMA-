package com.ijse.springbootcw.service;

import java.util.List;

import org.springframework.stereotype.Service;

//import com.ijse.springbootcw.dto.CategoryDTO;
import com.ijse.springbootcw.entity.Category;

@Service
public interface CategoryService {
    List<Category>getAllCategories();
    Category createCategory(Category category);
    void deleteCategory(Long id);
    Category getCategoryById(Long id);
  
}







  /* CategoryDTO addCategory(CategoryDTO categoryDTO);
    CategoryDTO updateCategory(Long id, CategoryDTO categoryDTO);
    void deleteCategory(Long id);
    List<CategoryDTO> getAllCategories(); */
 





/* import java.util.List;

import org.springframework.stereotype.Service;

//import org.springframework.stereotype.Service;

import com.ijse.Springintro.entity.Category;

@Service
public interface CategoryService {
     List<Category>getAllCategories();
    Category createCategory(Category category);
    Category getCategoryById(Long id);
} */