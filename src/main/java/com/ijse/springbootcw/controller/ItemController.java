package com.ijse.springbootcw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.springbootcw.dto.ItemReqDTO;
import com.ijse.springbootcw.entity.Category;
import com.ijse.springbootcw.entity.Item;
import com.ijse.springbootcw.service.CategoryService;
import com.ijse.springbootcw.service.ItemService;

@RestController
@CrossOrigin(origins="*") //ADD LATER
public class ItemController {
     @Autowired
    private ItemService itemService;

     @Autowired
    private CategoryService categoryService; 


    @GetMapping("/items")
    public ResponseEntity<List<Item>>getAllItems() {
        List<Item> items=itemService.getAllItems();
        return ResponseEntity.status(200).body(items);
    }

    @PostMapping("/items")
    public ResponseEntity<Item> createItem(@RequestBody ItemReqDTO itemReqDTO) { //Item item-ADD EARLY
        
       // ADD LATER
         Item item= new Item();
        item.setName(itemReqDTO.getName());
        item.setDescription(itemReqDTO.getDescription());
        item.setQuantity(itemReqDTO.getQuantity());
        item.setPrice(itemReqDTO.getPrice());
       

         
       Category category= categoryService.getCategoryById(itemReqDTO.getCategoryId());
        item.setCategory(category); 

        Item createdItem =itemService.createItem(item);
 
        return ResponseEntity.status(201).body(createdItem);
    }

    //ADD LATER

       @PutMapping("/items/{itemId}") 
    public ResponseEntity<Item> updateItem(@PathVariable Long itemId, @RequestBody ItemReqDTO itemReqDTO) {
        Item item= new Item();
        item.setName(itemReqDTO.getName());
        item.setDescription(itemReqDTO.getDescription());
        item.setQuantity(itemReqDTO.getQuantity());
        item.setPrice(itemReqDTO.getPrice());
     
        

        Category category= categoryService.getCategoryById(itemReqDTO.getCategoryId());
        item.setCategory(category);

         try {
            itemService.updateItem(itemId, item);
        } catch (Exception error) {
            System.out.println(error);
        } 

        return ResponseEntity.status(200).body(item);
    }

     @DeleteMapping("/items/{itemId}") 
    public ResponseEntity<String>deleteItem (@PathVariable Long itemId){
        itemService.deleteItem (itemId);
        
        return ResponseEntity.status(200).body("Item  Deleted");
    }
        
}



// @RestController
// //@CrossOrigin(origins="*")- ADD LATER
// public class ItemController {
//      @Autowired
//     private ItemService itemService;

//      @Autowired
//     private CategoryService categoryService; 


//     @GetMapping("/items")
//     public ResponseEntity<List<Item>>getAllItems() {
//         List<Item>items=itemService.getAllItems();
//         return ResponseEntity.status(200).body(items);
//     }

//     @PostMapping("/items")
//     public ResponseEntity<Item>createItem(@RequestBody ItemReqDTO itemReqDTO) { //Item item-ADD EARLY
        
//        // ADD LATER
//          Item  item= new Item ();
//         item.setName(itemReqDTO.getName());
//         item.setDescription(itemReqDTO.getDescription());
//         item.setPrice(itemReqDTO.getPrice());
//         item.setQuantity(itemReqDTO.getQuantity());

         
//        Category category= categoryService.getCategoryById(itemReqDTO.getCategoryId());
//         item.setCategory(category); 

//         Item createdItem =itemService.createItem (item);

           
//         return ResponseEntity.status(201).body(createdItem );
//     }

//     //ADD LATER

//        @PutMapping("/items/{itemId}") 
//     public ResponseEntity<Item >updateItem (@PathVariable Long itemId, @RequestBody ItemReqDTO itemReqDTO) {
//         Item item= new Item ();
//         item.setName(itemReqDTO.getName());
//         item.setDescription(itemReqDTO.getDescription());
//         item.setPrice(itemReqDTO.getPrice());
//         item.setQuantity(itemReqDTO.getQuantity());
        

//         Category category= categoryService.getCategoryById(itemReqDTO.getCategoryId());
//         item.setCategory(category);

//         Item updatedItem =itemService.updateItem (itemId,item);

//         return ResponseEntity.status(200).body(updatedItem);
//     }

//      /* @DeleteMapping("/items/{itemId}") 
//     public ResponseEntity<String>deleteItem (@PathVariable Long itemId){
//         itemService.deleteItem (itemId);
        
//         return ResponseEntity.status(200).body("Item  Deleted");
//     } */
        
// }




