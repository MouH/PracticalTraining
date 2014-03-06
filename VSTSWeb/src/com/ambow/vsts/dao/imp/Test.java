package com.ambow.vsts.dao.imp;

import java.sql.Date;

import com.ambow.vsts.entity.Holding;
import com.ambow.vsts.entity.Stock;
import com.ambow.vsts.entity.Trade;
import com.ambow.vsts.entity.TradeType;
import com.ambow.vsts.entity.User;

public class Test 
{
	public static void main(String args[]) throws Exception
	{
//		//测试user
//		User u = new User(); 
//		u.setId(4);
//		u.setEmail("spp");
//		u.setName("spp");
//		u.setPasswd("spp");
//		u.setPhone("spp");
//		u.setReg_date(new Date(1990,1,1));
//		new UserDaoHibernateImpl().addUser(u);
//		new UserDaoHibernateImpl().updateUser(u);
//		new UserDaoHibernateImpl().login("spp", "spp");
//		System.out.println(new UserDaoHibernateImpl().findAll());
		
//		//测试stock
//		Stock s = new Stock();
//		s.setCode("100072");
//		s.setId(1);
//		s.setName("安博");
//		s.setPrice(4.67);
//		new StockDaoHibernateImpl().addStock(s);
		System.out.println(new StockDaoHibernateImpl().findAll());
		
		//测试holding
//		Stock hs = new Stock();
//		hs.setId(1);                        
//		User hu = new User();
//		hu.setId(1);
//		Holding h = new Holding();
//		h.setId(1);
//		h.setNumber(1000);
//		h.setAvgPrice(6.8);
//		h.setStock(hs);
//		h.setUser(hu);
//		new HoldingDaoHibernateImpl().addHolding(h);
//		new HoldingDaoHibernateImpl().updateHolding(h);
//		new HoldingDaoHibernateImpl().deleteHolding(h);
//		new HoldingDaoHibernateImpl().findAll(1);
		
		//测试trade
//		User tu = new User();
//		tu.setId(22);
//		Stock ts = new Stock();
//		ts.setId(1);
//		TradeType tt = new TradeType();
//		tt.setId(1);
//		
//		Trade t = new Trade();
//		t.setTradeNumber(100);
//		t.setTradePrice(6.5);
//		t.setId(1);
//		t.setTradeDate(new java.util.Date());
//		t.setUser(tu);
//		t.setStock(ts);
//		t.setTradetype(tt);		
//		new TradeDaoHibernateImpl().addTrade(t);
//		new TradeDaoHibernateImpl().findAll(5);
//		System.out.println("ok4");		
	}
}
