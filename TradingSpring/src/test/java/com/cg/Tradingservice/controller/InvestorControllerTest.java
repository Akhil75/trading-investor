package com.cg.tradingservice.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cg.TradingService.controller.InvestorController;
import com.cg.TradingService.model.Investment;
import com.cg.TradingService.model.Stock;
import com.cg.TradingService.service.InvestorService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@RunWith(SpringRunner.class)
@WebMvcTest(value = InvestorController.class)
class InvestorControllerTest2 {
	 @Autowired
	    private MockMvc mockMvc;
	 
	 @MockBean
	    private InvestorService investorService;
	
	

	@Test
	public void testGetstock() throws Exception{
		String URI = "/api/v2/Stock";
		  Stock stock = new Stock();
	        stock.setStockCompanyName("dell");
	        stock.setStockOrderType("market");
	        stock.setStockSharePrice(600);
	        stock.setStockShareQuantity(9);

	        Stock stock1 = new Stock();
	        stock1.setStockCompanyName("lenovo");
	        stock1.setStockOrderType("market");
	        stock1.setStockSharePrice(806);
	        stock1.setStockShareQuantity(7);
	    	 List<Stock> stockList=new ArrayList<>();
	    	 stockList.add(stock);
	    	 stockList.add(stock1);
	    	 
	    	 String jsonInput = this.converttoJson(stockList);

	         Mockito.when(investorService.getAllStock()).thenReturn(stockList);
	         MvcResult mvcResult = this.mockMvc.perform(MockMvcRequestBuilders.get(URI).accept(MediaType.APPLICATION_JSON)).andReturn();
	         MockHttpServletResponse mockHttpServletResponse = mvcResult.getResponse();
	         String jsonOutput = mockHttpServletResponse.getContentAsString();

	         assertThat(jsonInput).isEqualTo(jsonOutput);
	     }


	private String converttoJson(Object  stock) throws JsonProcessingException {
		 ObjectMapper objectMapper = new ObjectMapper();
	        return objectMapper.writeValueAsString(stock);
	}

	

	@Test
	void testGetwatchlist() {
		fail("Not yet implemented");
	}

	@Test
	public void testBuyStock() throws Exception {
		 String URI = "/api/v2/buystocks";
	        Investment investment = new Investment();
	        investment.setInvestmentId(10);
	        investment.setInvestmentCompanyName("act");
	        investment.setInvestmentAmount(786);
	        investment.setNoOfStocks(7);

	        String jsonInput = this.converttoJson(investment);

	        Mockito.when(investorService.buyStock(Mockito.any(Investment.class))).thenReturn(investment);
	        MvcResult mvcResult = this.mockMvc.perform(MockMvcRequestBuilders.post(URI).accept(MediaType.APPLICATION_JSON).content(jsonInput).contentType(MediaType.APPLICATION_JSON))
	                .andReturn();
	        MockHttpServletResponse mockHttpServletResponse = mvcResult.getResponse();
	        String jsonOutput = mockHttpServletResponse.getContentAsString();
	        assertThat(jsonInput).isEqualTo(jsonOutput);
	        junit.framework.Assert.assertEquals(HttpStatus.OK.value(), mockHttpServletResponse.getStatus());
	    }
	
	

	@Test
	void testSellStock() {
		
		
	}

}
