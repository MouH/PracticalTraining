package com.ambow.vsts.dao.imp;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.vsts.util.HibernateUtil;

public class GenericDaoHibernateImpl {
	//保存
	public void save(Object obj) {
		Session session = new HibernateUtil().getSession();
		//打开一个事物
		Transaction tran = session.beginTransaction();
		//保存一个对象
		session.save(obj);
		tran.commit();
		session.flush();
		session.close();
	}
	
	//删除
	public void delete(Object obj) {
		Session session = new HibernateUtil().getSession();
		//打开一个事物
		Transaction tran = session.beginTransaction();
		//保存一个对象
		session.delete(obj);
		tran.commit();
		session.flush();
		session.close();
	}
	//修改
	public void update(Object obj) {
		Session session = new HibernateUtil().getSession();
		//打开一个事物
		Transaction tran = session.beginTransaction();
		//保存一个对象
		session.update(obj);
		tran.commit();
		session.flush();
		session.close();
	}
	
	//根据主键获得相应对象
	public  Object get(Class clazz,Long id) {
		Session session = new HibernateUtil().getSession();
		//打开一个事物
		Transaction tran = session.beginTransaction();
		//保存一个对象
		Object obj = session.get(clazz,id);
		tran.commit();
		session.flush();
		session.close();
		return obj;
	}
	//
}
