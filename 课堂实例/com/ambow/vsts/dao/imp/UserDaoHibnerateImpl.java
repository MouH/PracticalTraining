package com.ambow.vsts.dao.imp;

import java.util.Collection;

import com.ambow.vsts.dao.UserDao;
import com.ambow.vsts.entity.User;

public class UserDaoHibnerateImpl extends GenericDaoHibernateImpl
	implements UserDao{

	@Override
	public void addUser(User user) throws Exception {
		save(user);
		
	}

	@Override
	public Collection<User> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(String name, String passwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		update(user);
	}

}
