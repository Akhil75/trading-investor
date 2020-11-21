package com.cg.Tradingservice.services;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.TradingService.model.Investment;
import com.cg.TradingService.model.Stock;
import com.cg.TradingService.repository.InvestmentRepository;
import com.cg.TradingService.repository.InvestorRepository;
import com.cg.TradingService.repository.StockRepository;
import com.cg.TradingService.service.InvestorService;

import junit.framework.Assert;





@RunWith(SpringRunner.class)
@SpringBootTest
public class InvestorServiceImplTest {
	
	 @MockBean
	    private InvestorRepository investorRepository;

	    @Autowired
	    private InvestorService investorService;
	    
	    @Autowired
		private StockRepository stockrep;
		
		@Autowired
		private InvestmentRepository investmentrep;
		
		@Autowired 
		private InvestorRepository investorrep;
	@Test
	  public void testGetAllStock() throws Exception{
			Stock stock = new Stock();
	        stock.setStockCompanyName("samsung");
	        stock.setStockOrderType("market");
	        stock.setStockSharePrice(600);
	        stock.setStockShareQuantity(9);

	        Stock stock1 = new Stock();
	        stock1.setStockCompanyName("hp");
	        stock1.setStockOrderType("market");
	        stock1.setStockSharePrice(600);
	        stock1.setStockShareQuantity(9);

	        List<Stock> stockList = new ArrayList<>();
	        stockList.add(stock);
	        stockList.add(stock1);

	        Mockito.when(stockrep.findAll()).thenReturn(stockList);
	        assertThat(investorService.getAllStock()).isEqualTo(stockList);

	}
	@Test
	public void testGetWatchlist() throws Exception{
		Investment investment = new Investment();
		investment.setInvestmentId(1);
		investment.setInvestmentCompanyName("HDFC");
		investment.setInvestmentAmount(2500);
		investment.setInvestmentCompanySymbol(2);
		investment.setInvestmentInvestorId(1);
		investment.setNoOfStocks(50);
		
		
		
		  Mockito.when(investmentrep.save(investment)).thenReturn(investment);
	        Assert.assertTrue(investmentrep.findById(1).isEmpty());  

	}
	 
	public void testBuyStock() throws Exception{
		Investment investment = new Investment();
		investment.setInvestmentId(1);
		investment.setInvestmentCompanyName("HDFC");
		investment.setInvestmentAmount(2500);
		investment.setInvestmentCompanySymbol(2);
		investment.setInvestmentInvestorId(1);
		investment.setNoOfStocks(50);
		
		Mockito.when(investmentrep.save(investment)).thenReturn(investment);
        assertThat(investorService.buyStock(investment)).isEqualTo(investment);
	}
	
	public void testSellStock() throws Exception{
		Investment investment = new Investment();
		investment.setInvestmentId(3);
		investment.setInvestmentCompanyName("SBI");
		investment.setInvestmentAmount(2500);
		investment.setInvestmentCompanySymbol(4);
		investment.setInvestmentInvestorId(1);
		investment.setNoOfStocks(50);
		
		investmentrep.deleteById(investment.getInvestmentId());
        System.out.println(investmentrep.findById(3));
        Assert.assertTrue(investmentrep.findById(3).isEmpty());
	}
	    
}
