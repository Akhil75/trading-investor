package com.cg.TradingService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.TradingService.model.Investor;

@Repository
public interface InvestorRepository extends JpaRepository<Investor , Integer>
 {

}
