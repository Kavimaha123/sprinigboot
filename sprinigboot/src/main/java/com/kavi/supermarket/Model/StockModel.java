package com.kavi.supermarket.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class StockModel {
    @Id
    private Integer itemNumber;
    private Integer quantity;
    private Integer number;
    private String itemName;
    private String itemType;
    private Double price;

}
