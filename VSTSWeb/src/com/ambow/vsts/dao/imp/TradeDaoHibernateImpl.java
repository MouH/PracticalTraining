package com.ambow.vsts.dao.imp;

import java.util.Collection;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.vsts.dao.TradeDao;
import com.ambow.vsts.entity.Holding;
import com.ambow.vsts.entity.Stock;
import com.ambow.vsts.entity.Trade;
import com.ambow.vsts.entity.User;
import com.ambow.vsts.util.HibernateUtil;
import com.ambow.vsts.dao.imp.HoldingDaoHibernateImpl;

public class TradeDaoHibernateImpl extends GenericDaoHibernateImpl implements TradeDao 
{
		
	public void addTrade(Trade trade) throws Exception 
	{
		new GenericDaoHibernateImpl().save(trade);
		
		Session session = new HibernateUtil().getSession();
		Transaction tran = session.beginTransaction();
		String hql = "from Holding h where h.user.id=? and h.stock.id=?";
		
		Query query = session.createQuery(hql);
		query.setInteger(0,trade.user.id);
		query.setInteger(1,trade.stock.id);		
		List<Holding> list = query.list();

		
		Holding holding = new Holding();

		
		int number = trade.tradeNumber;
		double avgPrice = trade.tradePrice;
		
		if(list.size()!=0)
		{	
			holding = list.get(0);
			
			number = holding.number;
			double totalPrice = holding.getAvgPrice();
			avgPrice = holding.getAvgPrice();	
			
			System.out.println("is not null");
			System.out.println("ok "+number);
	
			if(trade.tradetype.id==1)
			{
				totalPrice = avgPrice*number;
				number = number + trade.tradeNumber;
				avgPrice = (totalPrice+trade.tradeNumber*trade.tradePrice)/number;
			}
			else
			{
				totalPrice = avgPrice*number;
				number = number - trade.tradeNumber;
				avgPrice = (totalPrice-trade.tradeNumber*trade.tradePrice)/number;
			}
			
			
			holding.setId(holding.id);			
			holding.setNumber(number);
			holding.setAvgPrice(avgPrice);
			holding.setStock(holding.stock);
			holding.setUser(holding.user);
			session.update(holding);
			
			tran.commit();
			session.flush();
			session.close();
		}		
		else
		{
			System.out.println("is null");
			
			holding.setId(1);
			holding.setNumber(trade.tradeNumber);
			holding.setAvgPrice(trade.tradePrice);
			holding.setStock(trade.stock);
			holding.setUser(trade.user);
			
			new HoldingDaoHibernateImpl().addHolding(holding);
		}
		
		
		System.out.println("id "+holding.id);
		System.out.println("avgPrice "+holding.avgPrice);
		System.out.println("number "+holding.number);
		

		

	}
	
	public Collection<Trade> findAll(int userid) throws Exception 
	{
			Session session = new HibernateUtil().getSession();
			Transaction tran = session.beginTransaction();
			String hql = "from Trade tr where tr.user.id=?";
			Collection<Trade> coll = session.createQuery(hql).setInteger(0, userid).list();
			for(Trade t:coll)
			{
				Hibernate.initialize(t.getUser());
				System.out.println(t.id+","+t.tradeNumber);
			}
			tran.commit();
			session.flush();
			session.close();
			return coll;
	}
}
