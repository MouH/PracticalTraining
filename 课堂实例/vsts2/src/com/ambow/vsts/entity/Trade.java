package com.ambow.vsts.entity;

import java.sql.Date;

public class Trade {
	private int  id;
	private  Stock  stock;
	private  double  tradePrice;
	private  int     tradeNumber;
	private  Date    tradeDate;
	private  TradeType   type;
	private  User  user;
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public Date getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
	public int getTradeNumber() {
		return tradeNumber;
	}
	public void setTradeNumber(int tradeNumber) {
		this.tradeNumber = tradeNumber;
	}
	public double getTradePrice() {
		return tradePrice;
	}
	public void setTradePrice(double tradePrice) {
		this.tradePrice = tradePrice;
	}
	public TradeType getType() {
		return type;
	}
	public void setType(TradeType type) {
		this.type = type;
	}
	public Trade(int id, Date date, int number, double price) {
		this.id = id;
		tradeDate = date;
		tradeNumber = number;
		tradePrice = price;
	}
	public Trade() {
	}
	public String toString() {
		return "stock name = "+ stock.getName()+" tradePrice = "+ this.tradePrice +" tradeNumber = "+ this.tradeNumber +" trade type = " + type.getInfo(); 
	}
	

}
