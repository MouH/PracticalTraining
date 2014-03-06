package com.ambow.vsts.dao.imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.ambow.vsts.dao.TradeDao;
import com.ambow.vsts.entity.Stock;
import com.ambow.vsts.entity.Trade;
import com.ambow.vsts.entity.TradeType;
import com.ambow.vsts.entity.User;
import com.ambow.vsts.util.DBConnection;

public class TradeDaoJdbc implements TradeDao{

	public static void main(String[] args) throws Exception {
		TradeDaoJdbc aa = new TradeDaoJdbc();
		User i = new User(3,"tom","345","asdf@sdfx","9090473",new Date(1990,1,1));
		TradeType t = new TradeType(1,"asdf");
		Stock s = new Stock("123",2,"gaoxiao",55);
		Trade tr = new Trade(1,s,new Date(1990,1,1),1,16,t,i);
		aa.addTrade(tr);
		System.out.println("ok");
/*		Collection<Trade> aaa = aa.findAll(1);
		for(Trade m:aaa) {
			System.out.println(m.getTradePrice());
//			System.out.println("ok");
 			}* */
	}

	public void addTrade(Trade trade) throws Exception {
		Connection conn = null;
		PreparedStatement prep = null;
		try {
			conn = new DBConnection().getConnection();
			String sql = "insert into trade(TradePrice,TradeNumber,TradeDate,UserId,stockId,TradeType)"
					+ "values(?,?,?,?,?,?)";
			prep = conn.prepareStatement(sql);
			// ���ò����ֵ
			prep.setDouble(1, trade.getTradePrice());
			prep.setInt(2, trade.getTradeNumber());
			prep.setDate(3, new java.sql.Date(trade.getTradeDate().getTime()));
			prep.setLong(4, trade.getUser().getUser_id());
			prep.setInt(5, trade.getStock().getId());
			prep.setInt(6, trade.getType().getId());
			// ִ��SQL���
			prep.executeUpdate(); // insert update delete
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			// �ر���Դ
			if(prep!=null)prep.close();
			if(conn!=null)conn.close();
		}
	}

	public Collection<Trade> findAll(int userid) throws SQLException {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		Collection<Trade> result = new ArrayList<Trade>(); 
		try {
			// ���Connection����
			conn = new DBConnection().getConnection();
			// conn���󣬻��ִ��SQL���Ķ���,PreparedStatement����
			String sql = "select * from trade";
			prep = conn.prepareStatement(sql);
			// ִ��SQL���
			rs = prep.executeQuery();
			//��������==��Java�еļ��϶���
			//�������ϵ��ӳ��
			while(rs.next()) {
				Trade t = new Trade();
				//�����е����==>u�����״̬
				t.setId(rs.getInt("TradeId"));
				t.setTradePrice(rs.getDouble("TradePrice"));
				t.setTradeNumber(rs.getInt("TradeNumber"));
				t.setTradeDate(rs.getDate("TradeDate"));
				t.setUser(getUser(rs.getInt("UserId")));
//				System.out.println();
				t.setStock(getStock(rs.getInt("StockId")));
				t.setType(getTradeType(rs.getInt("TradeType")));
				result.add(t);
			}
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			// �ر���Դ
			if(rs!=null) rs.close();
			if(prep!=null)prep.close();
			if(conn!=null)conn.close();
		}
		return result;
	}
	static User getUser(int user_id) throws Exception{
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		User u = null;
		try {
			// ���Connection����
			conn = new DBConnection().getConnection();
			// conn���󣬻��ִ��SQL���Ķ���,PreparedStatement����
			String sql = "select * from user where UserId =" + user_id ;
			prep = conn.prepareStatement(sql);
			// ִ��SQL���
			rs = prep.executeQuery();
			//��������==��Java�еļ��϶���
			//�������ϵ��ӳ��
			if(rs.next()) {
				u = new User();
				//�����е����==>u�����״̬
				u.setUser_id(rs.getInt("UserId"));
				u.setName(rs.getString("Name"));
//				u.setAddress(rs.getString("Address"));
				u.setPhone(rs.getString("Phone"));
				u.setEmail(rs.getString("Email"));
				u.setPasswd(rs.getString("PassWd"));
				u.setReg_date(rs.getDate("Reg_Date"));
			}
//				System.out.println("ok");
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			// �ر���Դ
			if(rs!=null) rs.close();
			if(prep!=null)prep.close();
			if(conn!=null)conn.close();
		}
		return u;
		//return new User(u.getAddress(),u.getEmail(),u.getUser_id(),u.getName(),u.getPasswd(),u.getPhone(),u.getReg_date());
	}
	static Stock getStock(int stock_id) throws Exception{
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		Stock s = null;
		try {
			// ���Connection����
			conn = new DBConnection().getConnection();
			// conn���󣬻��ִ��SQL���Ķ���,PreparedStatement����
			String sql = "select * from stock where StockId ="+stock_id ;
			prep = conn.prepareStatement(sql);
			// ִ��SQL���
			rs = prep.executeQuery();
			//��������==��Java�еļ��϶���
			//�������ϵ��ӳ��
			if(rs.next()){
				s = new Stock();
					//�����е����==>u�����״̬
				s.setId(rs.getInt("StockId"));
				s.setName(rs.getString("Name"));
				s.setCode(rs.getString("Code"));
				s.setPrice(rs.getDouble("Price"));
			}
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			// �ر���Դ
			if(rs!=null) rs.close();
			if(prep!=null)prep.close();
			if(conn!=null)conn.close();
		}
		return s;
	}
	static TradeType getTradeType(int tradeTypeId) throws Exception{
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		TradeType t = null;
		try {
			// ���Connection����
			conn = new DBConnection().getConnection();
			// conn���󣬻��ִ��SQL���Ķ���,PreparedStatement����
			String sql = "select * from tradetype where TradeTypeId ="+tradeTypeId ;
			prep = conn.prepareStatement(sql);
			// ִ��SQL���
			rs = prep.executeQuery();
			//��������==��Java�еļ��϶���
			//�������ϵ��ӳ��
			if(rs.next()){
				t = new TradeType();
					//�����е����==>u�����״̬
				t.setId(rs.getInt("TradeTypeId"));
				t.setInfo(rs.getString("Info"));
			}
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			// �ر���Դ
			if(rs!=null) rs.close();
			if(prep!=null)prep.close();
			if(conn!=null)conn.close();
		}
		return t;
	}

	@Override
	public Collection findAll(Integer userid) {
		// TODO Auto-generated method stub
		return null;
	}
}
