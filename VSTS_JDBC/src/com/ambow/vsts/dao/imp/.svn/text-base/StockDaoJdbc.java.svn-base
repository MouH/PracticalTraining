package com.ambow.vsts.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.ambow.vsts.dao.StockDao;
import com.ambow.vsts.entity.Stock;
import com.ambow.vsts.util.DBConnection;

public class StockDaoJdbc implements StockDao{
	
	public static void main(String[] args) throws Exception {
		StockDao dao = new StockDaoJdbc();
		//测试addUser
//		Stock s = new Stock("666666", 2, "中国联通", 9.98);
//		
//		dao.addStock(s);
//		System.out.println("ok");
//		Collection<Stock> stocks = dao.findAll();
//		for(Stock s:stocks) {
//
//			System.out.println(s.getId()+","+s.getName());
//		}
//		System.out.println("ok");
	}

	@Override
	public void addStock(Stock stock) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement prep = null;
		
		try{
			conn = new DBConnection().getConnection();
			String sql = "insert into stock(name,code,price)"+"values(?,?,?)";
			prep = conn.prepareStatement(sql);
			
			prep.setString(1, stock.getName());
			prep.setString(2, stock.getCode());
			prep.setDouble(3, stock.getPrice());
			
			prep.executeUpdate();
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			if(prep!=null) prep.close();
			if(prep!=null) conn.close();
		}
		
	}

	@Override
	public Collection<Stock> findAll() throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		
		Collection<Stock> result = new ArrayList<Stock>();
		try{
			conn = new DBConnection().getConnection();
			String sql = "select * from stock";
			prep = conn.prepareStatement(sql);
			rs = prep.executeQuery();
			
			while(rs.next())
			{
				Stock s = new Stock();
				
				s.setId(rs.getInt("StockId"));
				s.setName(rs.getString("Name"));
				s.setCode(rs.getString("Code"));
				s.setPrice(rs.getDouble("Price"));
				result.add(s);
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			if(rs!=null) rs.close();
			if(prep!=null)prep.close();
			if(conn!=null)conn.close();
		}
		return result;
	}
	
}
