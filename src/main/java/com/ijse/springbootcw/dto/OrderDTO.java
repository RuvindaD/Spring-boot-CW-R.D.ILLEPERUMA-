package com.ijse.springbootcw.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
    private List<Long> itemIds; 
}


/* public class OrderDTO {

    private Long id;
    private double totalPrice;
    private LocalDateTime saleDate;
    private List<ItemReqDTO> items;  // Include item data in SaleDTO

    // Getters and setters...
} */

