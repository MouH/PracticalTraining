package com.ambow.vsts.entity;

import java.util.Date;

public class Trade 
{
	public int id;
	public Stock stock;
	Date tradeDate;
	public int tradeNumber;
	public double tradePrice;
	public TradeType tradetype;
	public User user;

	public int getId()
	{
		return id;
	}
	
	public Stock getStock()
	{
		return stock;
	}
	
	public Date getTradeDate()
	{
		return tradeDate;
	}
	
	public int getTradeNumber()
	{
		return tradeNumber;
	}
	
	public double getTradePrice(){
		return tradePrice;
	}

	public TradeType getTradetype() {
		return tradetype;
	}

	public void setTradetype(TradeType tradetype) {
		this.tradetype = tradetype;
	}

	public User getUser()
	{
		return user;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setStock(Stock stock)
	{
		this.stock = stock;
	}
	
	public void setTradeDate(Date tradeDate)
	{
		this.tradeDate = tradeDate;
	}
	
	public void setTradeNumber(int tradeNumber)
	{
		this.tradeNumber = tradeNumber;
	}
	
	public void setTradePrice(double tradePrice)
	{
		this.tradePrice = tradePrice;
	}
	
	public void setUser(User user)
	{
		this.user = user;
	}
	
	public String toString()
	{
		return "Trade [id=" + id + ", stock=" + stock + ", tradeDate="+tradeDate+", tradeNumber="+tradeNumber+", tradePrice="+tradePrice+", tradeType="+tradetype+", User="+user+"]";
	}
	
	public Trade(Stock stock, Date tradeDate, int tradeNumber, double tradePrice, TradeType tradetype, User user)
	{
		this.stock = stock;
		this.tradeDate = tradeDate;
		this.tradeNumber = tradeNumber;
		this.tradePrice = tradePrice;
		this.tradetype = tradetype;
		this.user = user;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((stock == null) ? 0 : stock.hashCode());
		result = prime * result
				+ ((tradeDate == null) ? 0 : tradeDate.hashCode());
		result = prime * result + tradeNumber;
		long temp;
		temp = Double.doubleToLongBits(tradePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tradetype == null) ? 0 : tradetype.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trade other = (Trade) obj;
		if (id != other.id)
			return false;
		if (stock == null) {
			if (other.stock != null)
				return false;
		} else if (!stock.equals(other.stock))
			return false;
		if (tradeDate == null) {
			if (other.tradeDate != null)
				return false;
		} else if (!tradeDate.equals(other.tradeDate))
			return false;
		if (tradeNumber != other.tradeNumber)
			return false;
		if (Double.doubleToLongBits(tradePrice) != Double
				.doubleToLongBits(other.tradePrice))
			return false;
		if (tradetype == null) {
			if (other.tradetype != null)
				return false;
		} else if (!tradetype.equals(other.tradetype))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	public Trade()
	{
		
	}
}