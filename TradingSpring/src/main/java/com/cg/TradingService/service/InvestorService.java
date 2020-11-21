package com.cg.TradingService.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.TradingService.model.Investment;
import com.cg.TradingService.model.Investor;
import com.cg.TradingService.model.Stock;
import com.cg.TradingService.repository.InvestmentRepository;
import com.cg.TradingService.repository.InvestorRepository;
import com.cg.TradingService.repository.StockRepository;

@Service
@Transactional
public class InvestorService {
	@Autowired
	private StockRepository stockrep;
	@Autowired
	private InvestmentRepository investmentrep;
	@Autowired 
	private InvestorRepository investorrep;
	

public List<Stock> getAllStock(){
	return stockrep.findAll();
}
public List<Investment> getwatchList(int investorId){
return investmentrep.findByinvestmentInvestorId(investorId);
}

public Investment buyStock(Investment investment ) {
	return investmentrep.save(investment);
}
public boolean sellStock(int investmentId) {
	Investment investment = investmentrep.findById(investmentId).get();
	investmentrep.delete(investment);
	return true;
}
}
