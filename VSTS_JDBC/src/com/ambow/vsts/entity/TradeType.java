package com.ambow.vsts.entity;

public class TradeType {

	int id;
	String info;
	
	public int getId()
	{
		return id;
	}
	
	public String getInfo()
	{
		return info;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setInfo(String info)
	{
		this.info = info;
	}
	
	public TradeType(int id, String info)
	{
		this.id = id;
		this.info =info;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((info == null) ? 0 : info.hashCode());
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
		TradeType other = (TradeType) obj;
		if (id != other.id)
			return false;
		if (info == null) {
			if (other.info != null)
				return false;
		} else if (!info.equals(other.info))
			return false;
		return true;
	}

	public TradeType() {
		
	}
}