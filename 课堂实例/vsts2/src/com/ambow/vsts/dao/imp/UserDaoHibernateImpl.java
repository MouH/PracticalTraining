package com.ambow.vsts.dao.imp;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.vsts.dao.UserDao;
import com.ambow.vsts.entity.User;
import com.ambow.vsts.util.HibernateUtil;

public class UserDaoHibernateImpl extends GenericDaoHibernateImpl
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

	@SuppressWarnings("unchecked")
	@Override
	public User login(String name, String passwd) {
		Session session = new HibernateUtil().getSession();
		//打开一个事物
		Transaction tran = session.beginTransaction();
		String hql = "from User u where u.name=:name and u.passwd=:passwd";
		List<User> users = session.createQuery(hql).
			setString("name",name).
			setString("passwd",passwd).list();
		
		tran.commit();
		session.flush();
		session.close();

		return (users.size()==0)?null:users.get(0);
	}

	@Override
	public void updateUser(User user) {
		update(user);
	}
	
	public static void main(String[] args) {
		UserDaoHibernateImpl dao = new UserDaoHibernateImpl();
		User u = dao.login("wzj","wzj1");
		System.out.println(u);
	}

}
