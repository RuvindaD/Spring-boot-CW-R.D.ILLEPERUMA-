package com.ijse.springbootcw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.springbootcw.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    
}
 