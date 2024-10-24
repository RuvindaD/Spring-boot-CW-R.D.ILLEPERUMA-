package com.ijse.springbootcw.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.springbootcw.entity.Item;


@Service
public interface ItemService {
    List<Item>getAllItems();
    Item createItem (Item item);
    Item updateItem( Long id, Item item);
    Item getItemById(Long id);
    void deleteItem(Long id); 
}


/* @Service
public interface ItemService {
    List<Item> getAllItems();
    Item createItem(Item item);
    Item updateItem(Long id, Item item);
    Item getItemById(Long id);
    Item createItemWithStock(ItemReqDTO itemReqDTO);  // New method
} */
