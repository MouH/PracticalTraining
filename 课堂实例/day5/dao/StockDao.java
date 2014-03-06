package ambow.vsts.dao;

import java.util.Collection;

import ambow.vsts.entity.Stock;



public interface StockDao {

	public   void  addStock(Stock stock);
	public  Collection  findAll();
	
}
