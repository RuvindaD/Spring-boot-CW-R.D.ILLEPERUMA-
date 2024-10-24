package com.ijse.springbootcw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.springbootcw.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
