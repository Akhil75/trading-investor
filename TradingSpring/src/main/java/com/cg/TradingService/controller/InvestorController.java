package com.cg.TradingService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.TradingService.model.Investment;
import com.cg.TradingService.model.Stock;
import com.cg.TradingService.service.InvestorService;


@RestController
@RequestMapping("/api/v2")
public class InvestorController {
	@Autowired
	private InvestorService investor;
	
	@GetMapping("/stock")
	public List<Stock> getstock(){
		return investor.getAllStock();	
	}
	@GetMapping("/watchlist/{investorId}")
	@ResponseBody
	public List<Investment>getwatchlist(@PathVariable("investorId") int investorId){
		return investor.getwatchList(investorId);
	}
	@PostMapping("/buystocks")
	@ResponseBody
	public String buyStock(Investment investment) {
		investor.buyStock(investment);
		return "Succesfully bought the stocks";
	}
	@DeleteMapping("/sell/{investmentId}")
	@ResponseBody
	public boolean sellStock(@PathVariable("investmentId") int investmentId) {
		return investor.sellStock( investmentId);
		
	}
	
}
