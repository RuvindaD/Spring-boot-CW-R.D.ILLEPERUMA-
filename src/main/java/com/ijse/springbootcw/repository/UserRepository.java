package com.ijse.springbootcw.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.springbootcw.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    //to find user by username
    Optional<User>findByUsername(String username);
    
}
