package com.ambow.vsts.entity;

public class Holding {
	public double avgPrice;
	public int id;
	public int number;
	public Stock stock;
	public User user;
	
	public double getAvgPrice()
	{
		return avgPrice;
	}
	
	public int geId()
	{
		return id;
	}
	
	public int getId() {
		return id;
	}

	public int getNumber()
	{
		return number;
	}
	
	public Stock getStock()
	{
		return stock;
	}
	
	public User getUser()
	{
		return user;
	}
	
	public Holding(double avgPrice, int id, int number, Stock stock, User user)
	{
		this.avgPrice = avgPrice;
		this.id = id;
		this.number = number;
		this.stock = stock;
		this.user = user;
	}
	
	public void setAvgPrice(double avgPrice)
	{
		this.avgPrice = avgPrice;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public void setStock(Stock stock)
	{
		this.stock = stock;
	}
	
	public void setUser(User user)
	{
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avgPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + number;
		result = prime * result + ((stock == null) ? 0 : stock.hashCode());
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
		Holding other = (Holding) obj;
		if (Double.doubleToLongBits(avgPrice) != Double
				.doubleToLongBits(other.avgPrice))
			return false;
		if (id != other.id)
			return false;
		if (number != other.number)
			return false;
		if (stock == null) {
			if (other.stock != null)
				return false;
		} else if (!stock.equals(other.stock))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
	public Holding()
	{
		
	}
}
