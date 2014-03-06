package com.ambow.vsts.dao;

import java.util.Collection;

import com.ambow.vsts.entity.Stock;



public interface StockDao {

	public   void  addStock(Stock stock) throws Exception;
	public  Collection  findAll()throws Exception;

}
