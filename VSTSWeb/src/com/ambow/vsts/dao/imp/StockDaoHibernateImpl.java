package com.ambow.vsts.dao.imp;

import java.util.Collection;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.vsts.dao.StockDao;
import com.ambow.vsts.entity.Stock;
import com.ambow.vsts.entity.User;
import com.ambow.vsts.util.HibernateUtil;


public class StockDaoHibernateImpl extends GenericDaoHibernateImpl implements StockDao 
{
	public void addStock(Stock stock) throws Exception
	{
		new GenericDaoHibernateImpl().save(stock);
	}
	
	public Collection<Stock> findAll() throws Exception 
	{
		Session session = new HibernateUtil().getSession();
		Transaction tran = session.beginTransaction();
		Stock stock = new Stock();
		String hql = "from "+stock;
		System.out.println(hql);
		Collection<Stock> coll = session.createQuery(hql).list();
//		for(Stock s:coll)
//		{
//			Hibernate.initialize(s.getHolding());
//			Hibernate.initialize(s.getTrade());
//			System.out.println(s.id+","+s.name);
//		}
		tran.commit();
		session.flush();
		session.close();
		return coll;
		
		
		
//		Collection coll = getAll(new Stock());
//		return (Collection<Stock>)coll;
	}
	

}
