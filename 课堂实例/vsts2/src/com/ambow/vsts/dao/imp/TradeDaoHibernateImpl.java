package com.ambow.vsts.dao.imp;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.vsts.entity.Trade;
import com.ambow.vsts.entity.User;
import com.ambow.vsts.util.HibernateUtil;

public class TradeDaoHibernateImpl 
	extends GenericDaoHibernateImpl implements TradeDao {

	@Override
	public void addTrade(Trade trade) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection findAll(Integer userid) {
		Session session = new HibernateUtil().getSession();
		//打开一个事物
		Transaction tran = session.beginTransaction();
		String hql = "from Trade t where t.user.user_id=:id";
		List<Trade> trades = session.createQuery(hql).
			setInteger("id",userid).
			list();
		
		tran.commit();
		session.flush();
		session.close();
		return trades;
	}
	
	public static void main(String[] args) {
		TradeDaoHibernateImpl dao = new TradeDaoHibernateImpl();
		Collection trades = dao.findAll(1);
		System.out.println(trades);
	}
	
	

}
