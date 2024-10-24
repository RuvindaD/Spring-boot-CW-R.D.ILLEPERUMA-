package com.ijse.springbootcw.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private LocalDateTime orderDateTime;
    
    private Double totalPrice;

    @PrePersist

    protected void onCreate(){
        if(this.orderDateTime== null){
            this.orderDateTime=LocalDateTime.now();
        }
    }

    @ManyToMany
    @JoinTable(
        name="order_item",
        joinColumns = @JoinColumn(name="orderId"),
        inverseJoinColumns = @JoinColumn(name="itemId")
    )

        private List<Item> orderedItems;
   
    
}




/* package com.ijse.Springintro.entity;

import java.time.LocalDateTime;
import java.util.List;

//import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "orders")

public class Order {
@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private LocalDateTime orderDateTime;
    
    private Double totalPrice;

    @PrePersist

    protected void onCreate(){
        if(this.orderDateTime== null){
            this.orderDateTime=LocalDateTime.now();
        }
    }

    @ManyToMany
    @JoinTable(
        name="order_item",
        joinColumns = @JoinColumn(name="orderId"),
        inverseJoinColumns = @JoinColumn(name="itemId")
    )

        private List<Item> orderedItems;
   
    
}
 */