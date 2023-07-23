package com.kavi.supermarket.Controller;

import com.kavi.supermarket.Model.StockModel;
import com.kavi.supermarket.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockContrtoller {
@Autowired
StockService stockService;

@GetMapping
    public List<StockModel> getStocks(){
return stockService.getStocks();


    }
}
