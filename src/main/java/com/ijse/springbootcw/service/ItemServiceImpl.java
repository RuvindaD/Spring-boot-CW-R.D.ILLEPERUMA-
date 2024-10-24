package com.ijse.springbootcw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ijse.springbootcw.entity.Item;
//import com.ijse.springbootcw.entity.Stock;*********************
import com.ijse.springbootcw.repository.ItemRepository;


@Service
public class ItemServiceImpl implements ItemService{

@Autowired
private ItemRepository itemRepository;

@Override
public List<Item>getAllItems(){
    return itemRepository.findAll();
}

@Override
public Item createItem(Item item) {
    return itemRepository.save(item);
}

@Override
public Item updateItem(Long id,Item item) {
     Item existingItem=itemRepository.findById(id).orElse(null);

    if(existingItem==null){
        return null;
    }else{
        existingItem.setName(item.getName());
        existingItem.setPrice(item.getPrice());
        existingItem.setDescription(item.getDescription());
        existingItem.setCategory(item.getCategory());
        existingItem.setQuantity(item.getQuantity());////////////////////////////////////

        return itemRepository.save(existingItem);// CHANGED LATER
    }
   
}

@Override
public Item getItemById(Long id){
    return itemRepository.findById(id).orElse(null);
}

@Override
public void deleteItem(Long id){
    itemRepository.deleteById(id);
}



}
 




 
    


//REMOVE LATER

/* @Service
public class  ItemServiceImpl implements ItemService{

@Autowired
private  ItemRepository  itemRepository;

@Override
public List < Item>getAll Items(){
    return  itemRepository.findAll();
}

@Override
public  Item createItem(Item item) {
    return  itemRepository.save(item);
}

@Override
public Item updateItem(Long id,Item item) {
     Item existingItem=itemRepository.findById(id).orElse(null);

    if(existingItem==null){
        return null;
    }else{
        existingItem.setName(item.getName());
        existingItem.setPrice(item.getPrice());
        existingItem.setDescription(item.getDescription());
        existingItem.setCategory(item.getCategory());
    }
          

    return itemRepository.save(existingItem);
}
@Override
public Item getItemById(Long id){
    return itemRepository.findById(id).orElse(null);
}
@Override
public void deleteItem(Long id){
    itemRepository.deleteById(id);
}

}
 */



