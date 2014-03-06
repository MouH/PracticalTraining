package com.ambow.vsts.dao.imp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.ambow.vsts.entity.Holding;
import com.ambow.vsts.entity.Stock;
import com.ambow.vsts.entity.User;


public class HoldingJdbc 
{	
	
	Holding hold;
	String url = "jdbc:mysql://localhost/vsts";
	String user = "root";
	String password = "123";

	public  void  addHolding(Holding holding) throws SQLException
	{
		//����
		String sql = "insert into holding(HoldId,Number,AvgPrice,StockId,UserId)"
			+"values(?,?,?,?,?)";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement prep = conn.prepareStatement(sql);
		

		//���ò����ֵ
		this.hold = holding;
		
		prep.setInt(1,hold.geId());
		prep.setInt(2,hold.getNumber());
		prep.setDouble(3,hold.getAvgPrice());
		prep.setInt(4,hold.getStock().getId());
		prep.setLong(5,hold.getUser().getUser_id());
		
		prep.executeUpdate();
		
		prep.close();
		conn.close();
	}
	
	
	public  void  updateHolding(Holding holding) throws SQLException
	{
		
		//�޸�	
		String sql = "update holding set UserId=?,Number=?,AvgPrice=?,StockId=? where HoldId=?";
		
		Connection conn = DriverManager.getConnection(url, user, password);		
		PreparedStatement prep = 
			conn.prepareStatement(sql);
		
		this.hold = holding;

		//���ò����ֵ
		prep.setInt(5,hold.geId());
		prep.setInt(2,hold.getNumber());
		prep.setDouble(3,hold.getAvgPrice());
		prep.setInt(4,hold.getStock().getId());
		prep.setLong(1,hold.getUser().getUser_id());
		
		prep.executeUpdate();	//insert update delete
		//prep.executeQuery();	//select
		//�ر���Դ		
		prep.close();
		conn.close();
	}
	
	public  void  deleteHolding(int holdid) throws SQLException
	{
		String sql = "DELETE FROM holding WHERE HoldId=?";
		Connection conn = DriverManager.getConnection(url, user, password);		
		PreparedStatement prep = 
			conn.prepareStatement(sql);
		//���ò����ֵ
		//prep.setXxx(?��λ�ã�ֵ),?λ�ô�1��ʼ
		//Xxx��?�Ŷ�Ӧ���е��������
		prep.setInt(1,holdid);	
		
		prep.executeUpdate();
		
		prep.close();
		conn.close();
	}
	
	
	public  Collection  findAll(int userid) throws SQLException
	{
		//����
		Holding hold;
		Collection<Holding> coll = new ArrayList<Holding>();

		String sql = "select * from holding where UserId=?";
		
		Connection conn = DriverManager.getConnection(url, user, password);	
		PreparedStatement prep = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		//ִ��SQL���
		
		prep.setInt(1,userid);
		
		ResultSet rs = prep.executeQuery();
		//rs.next����:�ж���һ�����޼�¼���ޣ�����false
		//�У��ƶ�ָ�뵽��һ�У�����true

		while(rs.next()) {
			//ȡĳһ�е����:rs.getXxx("����"),�ж�Ӧ���������

			hold = new Holding(rs.getDouble("AvgPrice"),rs.getInt("HoldId"),rs.getInt("Number"),new Stock(rs.getInt("StockId")),new User(rs.getInt("UserId")));
			
			coll.add(hold);
			
		}
		
		prep.executeQuery();
		
		prep.close();
		conn.close();	
		
		return coll;
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");	
		Holding ho=new Holding(9.5,1,5000,new Stock(41),new User(5));
		
		new HoldingJdbc().addHolding(ho);
	//	new Holdingsql().deleteHolding(3);
	//	new Holdingsql().updateHolding(ho);
		
		System.out.println(new HoldingJdbc().findAll(5));
	}
}
