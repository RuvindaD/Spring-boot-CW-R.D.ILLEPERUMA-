package com.ijse.springbootcw.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.springbootcw.dto.OrderDTO;
import com.ijse.springbootcw.entity.Item;
import com.ijse.springbootcw.entity.Order;
import com.ijse.springbootcw.service.ItemService;
import com.ijse.springbootcw.service.OrderService;

@RestController
@CrossOrigin(origins="*")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired

    private ItemService itemService;
   
    @GetMapping("/orders")
    public ResponseEntity<List<Order>>getAllOrders(){

        List<Order>orders=orderService.getAllOrders();

       

        return ResponseEntity.status(200). body(orders);        
    }

        @PostMapping("/orders")
     public ResponseEntity<Order> createOrder (@RequestBody OrderDTO orderDTO){
        Order order= new Order();
        
        order.setTotalPrice(0.0);
        
        List<Long> itemIds= orderDTO.getItemIds();


        List<Item> orderedItems= new ArrayList<>();
        
        itemIds.forEach (itemId ->{

            Item item=itemService.getItemById(itemId);
            //add this item id to order

            if (item!=null) {

                orderedItems.add(item);

                //order.getOrderedItems().add(item);
                order.setTotalPrice(order.getTotalPrice() + item.getPrice());
                
            }

        });

            order.setOrderedItems(orderedItems);

        //save the order in DB

        orderService.createOrder(order);
        return ResponseEntity.status(201).body(order);

     } 
}
