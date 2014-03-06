package com.ambow.vsts.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User {
	String email;
	public int id;
	public String name;
	String passwd;
	String phone;  
	Date reg_date;
	Set<Trade> trade = new HashSet<Trade>();
	Set<Holding> holding = new HashSet<Holding>();
	
	public Set<Holding> getHolding() {
		return holding;
	}
	public void setHolding(Set<Holding> holding) {
		this.holding = holding;
	}
	public Set<Trade> getTrade() {
		return trade;
	}
	public void setTrade(Set<Trade> trade) {
		this.trade = trade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
	/*	return "User [email=" + email + ", id=" + id + ", name=" + name
				+ ", passwd=" + passwd + ", phone=" + phone + ", reg_date="
				+ reg_date + "]";*/
		return "User";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((passwd == null) ? 0 : passwd.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result
				+ ((reg_date == null) ? 0 : reg_date.hashCode());
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
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (passwd == null) {
			if (other.passwd != null)
				return false;
		} else if (!passwd.equals(other.passwd))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (reg_date == null) {
			if (other.reg_date != null)
				return false;
		} else if (!reg_date.equals(other.reg_date))
			return false;
		return true;
	}
	public User( String name,  String passwd,String email, 
			String phone, Date reg_date) {
		super();
		this.email = email;
		//this.id = (int) id;
		this.name = name;
		this.passwd = passwd;
		this.phone = phone;
		this.reg_date = reg_date;
	}
	public User()
	{}

	public User(int id)
	{
		this.id = id;
	}
}
