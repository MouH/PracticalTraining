package com.ambow.vsts.entity;

import java.util.HashSet;
import java.util.Set;

public class Stock {
	public String code;
	public int id;
	public String name;
	public double price;
	Set<Trade> trade = new HashSet<Trade>();
	Set<Holding> holding = new HashSet<Holding>();
	
	public Set<Trade> getTrade() {
		return trade;
	}

	public void setTrade(Set<Trade> trade) {
		this.trade = trade;
	}

	public Set<Holding> getHolding() {
		return holding;
	}

	public void setHolding(Set<Holding> holding) {
		this.holding = holding;
	}

	public String getCode()
	{
		return code;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setCode(String code)
	{
		this.code = code;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public Stock(String code, int id, String name, double price)
	{
		this.code = code;
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "Stock";
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Stock other = (Stock) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public Stock() {
		
	}
	
	public Stock(int id)
	{
		this.id = id;
	}
	
}