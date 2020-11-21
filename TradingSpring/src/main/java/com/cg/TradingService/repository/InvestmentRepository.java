package com.cg.TradingService.repository;


import org.springframework.stereotype.Repository;

import com.cg.TradingService.model.Investment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface InvestmentRepository extends  JpaRepository<Investment, Integer> {
 
	public List<Investment> findByinvestmentInvestorId(int investorId);
}
