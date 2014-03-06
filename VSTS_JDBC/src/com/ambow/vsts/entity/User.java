package com.ambow.vsts.entity;

import java.util.Date;


/**
 * @author user
 *
 */
public class User {
	String address;
	String email;
	long id;
	String name;
	String passwd;
	String phone;  
	Date reg_date;
	
	public String getAddress()
	{
		return address;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public long getUser_id()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPasswd()
	{
		return passwd;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public Date getReg_date()
	{
		return reg_date;
	}
	
//	public void setAddress(String address)
//	{
//		this.address = address;
//	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setUser_id(long id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPasswd(String passwd)
	{
		this.passwd = passwd;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public void setReg_date(Date reg_date)
	{
		this.reg_date = reg_date;
	}
	
	public User( long id, String name, String passwd, String email, String phone, Date reg_date)
	{
//		this.address = address;
		this.email = email;
		this.id = id;
		this.name = name;
		this.passwd = passwd;
		this.phone = phone;
		this.reg_date = reg_date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
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
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
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

	public User() {
		
	}
	
	public User(int id)
	{
		this.id = id;
	}
}
