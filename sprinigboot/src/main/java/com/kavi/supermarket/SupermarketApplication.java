package com.kavi.supermarket;
import com.kavi.supermarket.Model.StockModel;
import com.kavi.supermarket.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SupermarketApplication {
	@Autowired
	StockRepository stockRepository;

	@PostConstruct
	public void init(){
		StockModel stock= new StockModel();
		stock.setItemNumber(1);
		stock.setItemName("Natraj");
		stock.setPrice(10.0);
		stock.setQuantity(10);
		stock.setItemType("pencil");

		stockRepository.save(stock);
	}


	public static void main(String[] args) {
		SpringApplication.run(SupermarketApplication.class, args);
	}

}
