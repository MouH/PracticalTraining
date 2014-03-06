package com.ambow.vsts.dao;

import java.util.Collection;

import com.ambow.vsts.entity.User;

public interface UserDao {
	public User login(String name, String passwd);

	public void addUser(User user)throws Exception;

	public void updateUser(User user);
	
	public Collection<User> findAll()throws Exception;
}
