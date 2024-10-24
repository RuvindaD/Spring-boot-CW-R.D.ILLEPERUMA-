/* package com.ijse.springbootcw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.springbootcw.dto.StockDTO;
import com.ijse.springbootcw.entity.Item;
import com.ijse.springbootcw.entity.Stock;
import com.ijse.springbootcw.service.ItemService;
import com.ijse.springbootcw.service.StockService;

@RestController
@CrossOrigin(origins="*")
public class StockController {
        @Autowired
    private StockService stockService;

     @Autowired
    private ItemService itemService;


    @PostMapping
    public ResponseEntity<Stock> createStock(@RequestBody StockDTO stockDTO) {
       Stock stock= new Stock();
        stock.setStockQuantity(stockDTO.getStockQuantity());
       

         
       Item item= itemService.getItemById(stockDTO.getItemId());
        stock.setItem(item); 

        Stock createdStock =stockService.createStock(stock);
 
        return ResponseEntity.status(201).body(createdStock);//ResponseEntity.status(201).body(createdItem);
    }

    @PutMapping("/stocks/{stockId}")
    public ResponseEntity<Stock> updateStock(@PathVariable Long stockId, @RequestBody StockDTO stockDTO) {
        Stock stock= new Stock();
        stock.setStockQuantity(stockDTO.getStockQuantity());

        Item item= itemService.getItemById(stockDTO.getItemId());
        stock.setItem(item);

         try {
            stockService.updateStock(stockId, stock);
        } catch (Exception error) {
            System.out.println(error);
        } 
       
        return ResponseEntity.status(200).body(stock);   // ResponseEntity.status(200).body(item);
    }

    @DeleteMapping("/stocks/{stockId}") 
    public ResponseEntity<String>deleteStock (@PathVariable Long stockId){
        stockService.deleteStock(stockId); 
        
        return ResponseEntity.status(200).body("StockDeleted");
    }

    @GetMapping("/stocks")
    public ResponseEntity<List<Stock>> getAllStocks() {
        List<Stock> stocks=stockService.getAllStocks();
        return ResponseEntity.status(200).body(stocks); //.status(200).body(items);
    }
}

 */