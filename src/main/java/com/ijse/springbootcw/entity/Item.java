package com.ijse.springbootcw.entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/* import java.util.Locale.Category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter; */

@Entity
@Getter
@Setter
//@Table(name = "items")//ADDED LATER
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    //@Column(nullable = false)
     private Double quantity;
   
   // @Column(nullable = false)
    private Double price;
 
   

    @ManyToOne
    @JoinColumn(name = "category_id")//, nullable = false
    private Category category; 
   
    
   
    @JsonIgnore
    @ManyToMany(mappedBy = "orderedItems")
    private List<Order> orders;

    // Relationship: One Item has one stock record
    //  @OneToOne(mappedBy = "item", cascade = CascadeType.ALL) //NEW ADDITION
    // private Stock stock; 
    
 
}

/* 
@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String description;

    @ManyToOne
    @JoinColumn(name= "category_id")
    private Category category;

    @JsonIgnore
    @ManyToMany(mappedBy = "orderedProducts")
    private List<Order>orders;
} */