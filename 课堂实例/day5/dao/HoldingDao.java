package ambow.vsts.dao;

import java.util.Collection;

import ambow.vsts.entity.Holding;



public interface HoldingDao {
    //CRUD  Create  Read  Update  Delete
	public  void  addHolding(Holding holding);
	public  void  updateHolding(Holding holding);
	public  void  deleteHolding(Holding holding);
	
	public  Collection  findAll(Integer userid);
	
}
