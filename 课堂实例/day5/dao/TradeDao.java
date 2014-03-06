package ambow.vsts.dao;

import java.util.Collection;

import ambow.vsts.entity.Trade;


public interface TradeDao {

	public  void  addTrade(Trade  trade);
	public  Collection  findAll(Integer userid);
	
}
