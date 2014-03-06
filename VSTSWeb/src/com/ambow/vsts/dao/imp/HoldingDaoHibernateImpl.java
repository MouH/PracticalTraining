package com.ambow.vsts.dao.imp;

import java.util.Collection;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.vsts.dao.HoldingDao;
import com.ambow.vsts.entity.Holding;
import com.ambow.vsts.entity.User;
import com.ambow.vsts.util.HibernateUtil;

public class HoldingDaoHibernateImpl extends GenericDaoHibernateImpl implements HoldingDao
{
	public  void  addHolding(Holding holding)
	{
		save(holding);
	}

	public void updateHolding(Holding holding) 
	{
		update(holding);		
	}

	public void deleteHolding(Holding holding) 
	{
		delete(holding);
	}

	public Collection<Holding> findAll(int userid) 
	{
		Session session = new HibernateUtil().getSession();
		Transaction tran = session.beginTransaction();
		String hql = "from Holding ho where ho.user.id=?";	
		Collection<Holding> coll = session.createQuery(hql).setInteger(0, userid).list();
		for(Holding h:coll)
		{
			Hibernate.initialize(h.getUser());
			System.out.println(h.id+","+h.number);
		}
		tran.commit();
		session.flush();
		session.close();
		return coll;
	}	
}
