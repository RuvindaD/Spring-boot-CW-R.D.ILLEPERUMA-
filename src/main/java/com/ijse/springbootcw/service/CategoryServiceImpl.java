package com.ijse.springbootcw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.springbootcw.entity.Category;

import com.ijse.springbootcw.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }


     @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
        //return categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category not found"));
    }  
   

@Override
public void deleteCategory(Long id) {
    categoryRepository.deleteById(id);
} 

    
}
 

