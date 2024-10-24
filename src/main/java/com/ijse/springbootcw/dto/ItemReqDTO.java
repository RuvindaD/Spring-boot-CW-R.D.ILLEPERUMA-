package com.ijse.springbootcw.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ItemReqDTO {
    private String name;
    private String description;
    private Double quantity;
    private Double price;
    private Long categoryId;
    //private StockDTO stock;  // Stock data embedded in ItemReqDTO
}







// public class ItemReqDTO {
//     private String name;
//     private String description; 
//     private Double price;
//     private Double quantity;
//     private Long categoryId; 
//    // private StockReqDTO stock; //************************* 
// }
