package com.ijse.springbootcw.repository;

//import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.springbootcw.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    
} 



/* @Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
   
} */