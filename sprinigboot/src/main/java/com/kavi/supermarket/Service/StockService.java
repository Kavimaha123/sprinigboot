package com.kavi.supermarket.Service;


import com.kavi.supermarket.Model.StockModel;
import com.kavi.supermarket.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    @Autowired
    StockRepository stockRepository;

    public List<StockModel> getStocks() {
        List<StockModel> res=  stockRepository.findAll();
        return res;
    }
}
