package com.ijse.springbootcw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ijse.springbootcw.entity.Category;
import com.ijse.springbootcw.service.CategoryService;

@RestController
@CrossOrigin(origins="*")
public class CategoryController {
   
    @Autowired
    private CategoryService categoryService;


    @GetMapping("/categories")
    public ResponseEntity<List<Category>>getAllCategories() {
        List<Category>categories=categoryService.getAllCategories();
        return ResponseEntity.status(200).body(categories);
    }

    @PostMapping("/categories")
    public ResponseEntity<Category>createCategory(@RequestBody Category category) {
       Category createdCategory=categoryService.createCategory(category);
   
 
        
        return ResponseEntity.status(201).body(createdCategory);
    }

  /*  @DeleteMapping("/categories/{categoryId}") 
    public ResponseEntity<String>deleteCategory (@PathVariable Long categoryId){
        categoryService.deleteCategory (categoryId);
        
        return ResponseEntity.status(200).body("Category  Deleted");
    } */

  
}


