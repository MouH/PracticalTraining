package com.ambow.vsts.dao.imp;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.vsts.entity.Trade;
import com.ambow.vsts.entity.User;
import com.ambow.vsts.util.HibernateUtil;

public class GenericDaoHibernateImpl 
{
	//����
	public void save(Object obj) 
	{
		Session session = new HibernateUtil().getSession();
		//��һ������
		Transaction tran = session.beginTransaction();
		//����һ������
		session.save(obj);
		tran.commit();
		session.flush();	
		session.close();
	}
	
	//ɾ��
	public void delete(Object obj) 
	{
		Session session = new HibernateUtil().getSession();
		//��һ������
		Transaction tran = session.beginTransaction();
		//����һ������
		session.delete(obj);
		tran.commit();
		session.flush();
		session.close();
	}
	//�޸�
	public void update(Object obj) 
	{
		Session session = new HibernateUtil().getSession();
		//��һ������
		Transaction tran = session.beginTransaction();
		//����һ������
		session.update(obj);
		tran.commit();
		session.flush();
		session.close();
	}
	
	//�����������Ӧ����
	public  Object get(Class clazz,Long id) 
	{
		Session session = new HibernateUtil().getSession();
		//��һ������
		Transaction tran = session.beginTransaction();
		//����һ������
		Object obj = session.get(clazz,id);
		tran.commit();
		session.flush();
		session.close();
		return obj;
	}
	//
	public Collection<Object> getAll(Object obj){
//		Collection<User> obj = new HashSet<Object>();
		Session session = new HibernateUtil().getSession();
		Transaction tran = session.beginTransaction();
		String hql = "from " +obj;
		System.out.println(hql+"----------------");
		Collection<Object> obj1 = session.createQuery(hql).list();
		tran.commit();
		session.flush();
		session.close();
		return obj1;
	}
}
