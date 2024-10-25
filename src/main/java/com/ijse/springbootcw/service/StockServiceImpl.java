/* package com.ijse.springbootcw.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ijse.springbootcw.entity.Stock;
import com.ijse.springbootcw.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService{
     @Autowired
    private StockRepository stockRepository;


    @Override
    public Stock updateStock(Long id, Stock stock) {
        Stock existingStock=stockRepository.findById(id).orElse(null);

        if(existingStock==null){
            return null;
        }else{
            existingStock.setItem(stock.getItem());
            existingStock.setStockQuantity(stock.getStockQuantity());
            
    
            return stockRepository.save(existingStock);// CHANGED LATER
        }
    }

    @Override
    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }

    @Override
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
        
    }

    @Override
    public Stock createStock(Stock stock) {
    return stockRepository.save(stock);
}

    @Override
    public Stock getStockById(Long id) {
        return stockRepository.findById(id).orElse(null);
    }
}
 */