package com.ijse.springbootcw.service;

import org.springframework.stereotype.Service;

import com.ijse.springbootcw.entity.User;

@Service
public interface UserService  {
    User createUser(User user);
    
}
    

