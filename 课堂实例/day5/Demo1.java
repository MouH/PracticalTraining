package day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//联接数据库的关键代码
		//装载驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		//获得联接对象
		String url = "jdbc:mysql://localhost/vsts";
		String user = "root";
		String password = "root";
		Connection conn = 
			DriverManager.getConnection(url, user, password);
		
		//conn对象，获得执行SQL语句的对象,PreparedStatement对象
		//增删改数据库表中的数据
		//1删除
		//?号作为参数的占位符
//		String sql = "DELETE FROM USER WHERE user_id=?";
//		PreparedStatement prep = 
//			conn.prepareStatement(sql);
//		//设置参数的值
//		//prep.setXxx(?的位置，值),?位置从1开始
//		//Xxx是?号对应的列的数据类型
//		prep.setInt(1, 3);
		//2、修改
//		String sql = "update user set passwd=?,phone=? where user_id=?";
//		PreparedStatement prep = 
//		conn.prepareStatement(sql);
//		//设置参数的值
//		prep.setString(1,"12345");
//		prep.setString(2,"13612345678");
//		prep.setInt(3,2);
	
		//3、插入
		String sql = "insert into user(name,passwd,phone,email,address,reg_date)"
				+"values(?,?,?,?,?,?)";
		PreparedStatement prep = 
			conn.prepareStatement(sql);
		//设置参数的值
		prep.setString(1,"tom");
		prep.setString(2,"tom");
		prep.setString(3,"13712345678");
		prep.setString(4,"a@sina.com");
		prep.setString(5,"ambow road");
		prep.setString(6,"1991-11-11");
		//执行SQL语句
		prep.executeUpdate();	//insert update delete
		//prep.executeQuery();	//select
		//关闭资源
		prep.close();
		conn.close();
		
		System.out.println("ok");
		
	}

}
