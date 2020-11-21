package com.cg.TradingService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name ="INVESTOR")
public class Investor {
	
	@Id
	@Column(name ="INVESTOR_ID")
	private int investorId;
	
	@Column(name ="INVESTOR_NAME")
	private String investorName;
	
	@Column(name ="INVESTOR_PANNUM")
	private String investorPannum;
	
	@Column(name ="INVESTOR_EMAIL")
	private String investorEmail;
	
	@Column(name ="INVESTOR_PHONE")
	private String investorPhone;
	
	@Column (name ="NO_OF_STOCKS_BOUGHT")
	private int numOfStocks;
	
	@Column(name = "TOTAL_INVESTMENT")
	private int investorInvestment;
   public Investor()
   {
	   
   }
public Investor(int investorId, String investorName, String investorPannum, String investorEmail, String investorPhone,
		int numOfStocks, int investorInvestment) {
	super();
	this.investorId = investorId;
	this.investorName = investorName;
	this.investorPannum = investorPannum;
	this.investorEmail = investorEmail;
	this.investorPhone = investorPhone;
	this.numOfStocks = numOfStocks;
	this.investorInvestment = investorInvestment;
}
public int getInvestorId() {
	return investorId;
}
public void setInvestorId(int investorId) {
	this.investorId = investorId;
}
public String getInvestorName() {
	return investorName;
}
public void setInvestorName(String investorName) {
	this.investorName = investorName;
}
public String getInvestorPannum() {
	return investorPannum;
}
public void setInvestorPannum(String investorPannum) {
	this.investorPannum = investorPannum;
}
public String getInvestorEmail() {
	return investorEmail;
}
public void setInvestorEmail(String investorEmail) {
	this.investorEmail = investorEmail;
}
public String getInvestorPhone() {
	return investorPhone;
}
public void setInvestorPhone(String investorPhone) {
	this.investorPhone = investorPhone;
}
public int getNumOfStocks() {
	return numOfStocks;
}
public void setNumOfStocks(int numOfStocks) {
	this.numOfStocks = numOfStocks;
}
public int getInvestorInvestment() {
	return investorInvestment;
}
public void setInvestorInvestment(int investorInvestment) {
	this.investorInvestment = investorInvestment;
}
@Override
public String toString() {
	return "Investor [investorId=" + investorId + ", investorName=" + investorName + ", investorPannum="
			+ investorPannum + ", investorEmail=" + investorEmail + ", investorPhone=" + investorPhone
			+ ", numOfStocks=" + numOfStocks + ", investorInvestment=" + investorInvestment + "]";
}
   
}

