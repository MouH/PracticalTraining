package com.ambow.vsts.dao;

import java.util.Collection;

import com.ambow.vsts.entity.Trade;


public interface TradeDao {

	public  void  addTrade(Trade  trade)throws Exception;
	public  Collection<Trade>  findAll(int userid) throws Exception;
	
}
