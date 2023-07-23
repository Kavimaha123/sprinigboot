package com.kavi.supermarket.Repository;

import com.kavi.supermarket.Model.StockModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<StockModel,Integer> {
}
