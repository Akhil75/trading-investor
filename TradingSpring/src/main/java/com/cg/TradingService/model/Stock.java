package com.cg.TradingService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="STOCK")
public class Stock {
	@Id
	@Column(name ="STOCK_COMPANY_SYMBOL")
private int stockCompanySymbol;
	@Column(name ="STOCK_COMPANY_NAME")
private String stockCompanyName;
	@Column(name ="STOCK_SHARE_QUANTITY")
private int stockShareQuantity;
	@Column(name ="STOCK_ORDER_TYPE")
private String stockOrderType;
	@Column(name ="STOCK_SHARE_PRICE")
private int stockSharePrice;
	@Column(name ="STOCK_MAX_AMOUNT")
private int stockMaxAmount;
	public Stock() {
		
	}
	@Override
	public String toString() {
		return "Stock [stockCompanySymbol=" + stockCompanySymbol + ", stockCompanyName=" + stockCompanyName
				+ ", stockShareQuantity=" + stockShareQuantity + ", stockOrderType=" + stockOrderType
				+ ", stockSharePrice=" + stockSharePrice + ", stockMaxAmount=" + stockMaxAmount + "]";
	}
	public Stock(int stockCompanySymbol, String stockCompanyName, int stockShareQuantity, String stockOrderType,
			int stockSharePrice, int stockMaxAmount) {
		super();
		this.stockCompanySymbol = stockCompanySymbol;
		this.stockCompanyName = stockCompanyName;
		this.stockShareQuantity = stockShareQuantity;
		this.stockOrderType = stockOrderType;
		this.stockSharePrice = stockSharePrice;
		this.stockMaxAmount = stockMaxAmount;
	}
	public int getStockCompanySymbol() {
		return stockCompanySymbol;
	}
	public void setStockCompanySymbol(int stockCompanySymbol) {
		this.stockCompanySymbol = stockCompanySymbol;
	}
	public String getStockCompanyName() {
		return stockCompanyName;
	}
	public void setStockCompanyName(String stockCompanyName) {
		this.stockCompanyName = stockCompanyName;
	}
	public int getStockShareQuantity() {
		return stockShareQuantity;
	}
	public void setStockShareQuantity(int stockShareQuantity) {
		this.stockShareQuantity = stockShareQuantity;
	}
	public String getStockOrderType() {
		return stockOrderType;
	}
	public void setStockOrderType(String stockOrderType) {
		this.stockOrderType = stockOrderType;
	}
	public int getStockSharePrice() {
		return stockSharePrice;
	}
	public void setStockSharePrice(int stockSharePrice) {
		this.stockSharePrice = stockSharePrice;
	}
	public int getStockMaxAmount() {
		return stockMaxAmount;
	}
	public void setStockMaxAmount(int stockMaxAmount) {
		this.stockMaxAmount = stockMaxAmount;
	}
}
