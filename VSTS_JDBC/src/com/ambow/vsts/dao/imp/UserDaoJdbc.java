package com.ambow.vsts.dao.imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.ambow.vsts.dao.UserDao;
import com.ambow.vsts.entity.User;
import com.ambow.vsts.util.DBConnection;

public class UserDaoJdbc implements UserDao {
	
	Connection conn = null;
	PreparedStatement prep = null;
	ResultSet rs = null;

	public static void main(String[] args) throws Exception {
		UserDao dao = new UserDaoJdbc();
		//测试addUser
//		User u = new User();
//		u.setName("alice");
//		u.setEmail("a@tom.com");
//		u.setPasswd("12345");
////		u.setAddress("ambow");
//		u.setPhone("15612345678");
//		u.setReg_date(new java.util.Date());
//		dao.addUser(u);
//		System.out.println("ok");
//		Collection<User> users = dao.findAll();
//		for(User u:users) {
//			System.out.println(u.getUser_id()+","+u.getName());
//		}
//		//测试findAll
//		Date d=new Date(System.currentTimeMillis() + 30 * 60 * 1000);
//		User u1 = new User(1,"spp","1234","a@sina.com","110",d);
//		dao.addUser(u1);
//		System.out.println(dao.findAll());
//测试login  login判断方法
		UserDaoJdbc uu = new UserDaoJdbc();
		User uuu = uu.login("lice", "1345");
//		if(!uuu.getName().isEmpty()){
//			System.out.println("有此用户！");
//		}
//		else System.out.println("无此用户！");
	}
	

	public void addUser(User user) throws Exception {

		try {
			// 获得Connection对象
			conn = new DBConnection().getConnection();
			// conn对象，获得执行SQL语句的对象,PreparedStatement对象
			// 3、插入
			String sql = "insert into user(name,passwd,phone,email,reg_date)"
					+ "values(?,?,?,?,?)";
			prep = conn.prepareStatement(sql);
			// 设置参数的值
			prep.setString(1, user.getName());
			prep.setString(2, user.getPasswd());
			prep.setString(3, user.getPhone());
			prep.setString(4, user.getEmail());
			prep.setDate(5, new java.sql.Date(user.getReg_date().getTime()));
			// 执行SQL语句
			prep.executeUpdate(); // insert update delete
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			// 关闭资源
			if(prep!=null)prep.close();
			if(conn!=null)conn.close();
		}

	}


	public Collection<User> findAll() throws Exception  {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		Collection<User> result = new ArrayList<User>(); 
		try {
			// 获得Connection对象
			conn = new DBConnection().getConnection();
			// conn对象，获得执行SQL语句的对象,PreparedStatement对象
			String sql = "select * from user";
			prep = conn.prepareStatement(sql);
			// 执行SQL语句
			rs = prep.executeQuery();
			//结果集中数据==》Java中的集合对象
			//对象与关系的映射
			while(rs.next()) {
				User u = new User();
				//将行中的数据==>u对象的状态
				u.setUser_id(rs.getLong("UserId"));
				u.setName(rs.getString("name"));
				u.setPhone(rs.getString("phone"));
				u.setEmail(rs.getString("email"));
				u.setPasswd(rs.getString("passwd"));
				u.setReg_date(rs.getDate("reg_date"));
				result.add(u);
			}
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			// 关闭资源
			if(rs!=null) rs.close();
			if(prep!=null)prep.close();
			if(conn!=null)conn.close();
		}
		return result;
	}


	public User login(String name, String passwd) throws Exception {
		// TODO Auto-generated method stub
		User u= new User();
		conn=new DBConnection().getConnection();
		String sql ="select * from user where name='"+name+"'";
		prep = conn.prepareStatement(sql);
		rs = prep.executeQuery();
		if(rs.next()){
			System.out.println("I'm here!");
			if(passwd.equals(rs.getString("passwd")))
			{	u.setUser_id(rs.getLong("userId"));
				u.setName(rs.getString("name"));
				u.setPhone(rs.getString("phone"));
				u.setEmail(rs.getString("email"));
				u.setPasswd(rs.getString("passwd"));
				u.setReg_date(rs.getDate("reg_date"));
					
//			  System.out.println("get out!");
			}
			else
				  System.out.println("ok!");
			return u;
		}
		System.out.println("I'm Here!");
		return u;
	}


	public void updateUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update user set name=?,passwd=?,phone=?,email=?,reg_date=? where user_id=?";
		PreparedStatement prep = conn.prepareStatement(sql);
		// //设置参数的值
		prep.setString(1, user.getName());
		prep.setString(2, user.getPasswd());
		prep.setString(3, user.getPhone());
		prep.setString(4, user.getEmail());
		prep.setDate(5, new java.sql.Date(user.getReg_date().getTime()));
		prep.setLong(6, user.getUser_id());

	}

}
