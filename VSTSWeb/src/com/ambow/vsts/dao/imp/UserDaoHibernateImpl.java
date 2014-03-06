package com.ambow.vsts.dao.imp;

import java.util.Collection;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.vsts.dao.UserDao;
import com.ambow.vsts.entity.Trade;
import com.ambow.vsts.entity.User;
import com.ambow.vsts.util.HibernateUtil;

public class UserDaoHibernateImpl extends GenericDaoHibernateImpl implements UserDao
{
	public void addUser(User user) throws Exception 
	{
		new GenericDaoHibernateImpl().save(user);
	}

	public Collection<User> findAll() throws Exception 
	{
		Session session = new HibernateUtil().getSession();
		Transaction tran = session.beginTransaction();
		User user = new User();
		String hql = "from "+user;
		Collection<User> coll = session.createQuery(hql).list();
		for(User u:coll)
		{
			System.out.println(u.id+","+u.name);
		}
		tran.commit();
		session.flush();
		session.close();
		return coll;
	}

	public User getUserByName(String name)
	{
		Collection<User> coll = new HashSet();
		Collection co = new HashSet();
		User u = new User();
		Session session = new HibernateUtil().getSession();
		Transaction tran = session.beginTransaction();
		String hql = "from User u where u.name = '" +name+"'";
		coll = session.createQuery(hql).list();
		for(User user:coll){
			u = user;
			System.out.println(u.getName()+","+u.getPasswd());
		}
		tran.commit();
		session.flush();
		session.close();
		return u;
	}

	public User login(String name, String passwd) 
	{
		User user = new User();
		user = new UserDaoHibernateImpl().getUserByName(name);
		if(!user.getPasswd().isEmpty()){
			return user;
		}
		else return null;
		
	}

	public void updateUser(User user) {
		update(user);
	}
	
}
