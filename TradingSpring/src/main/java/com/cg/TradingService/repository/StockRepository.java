package com.cg.TradingService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.TradingService.model.Stock;
@Repository
public interface StockRepository extends JpaRepository<Stock ,Integer> {

}
