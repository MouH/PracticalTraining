package com.ambow.vsts.dao.imp;

import java.util.Collection;

import com.ambow.vsts.entity.Trade;

public interface TradeDao {

	public void addTrade(Trade trade);

	public Collection findAll(Integer userid);

}
