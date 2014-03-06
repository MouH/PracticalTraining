package com.ambow.vsts.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public Connection getConnection() throws Exception {
		//装载驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		//获得联接对象
		String url = "jdbc:mysql://localhost/vsts";
		String user = "root";
		String password = "root";
		return 
			DriverManager.getConnection(url, user, password);
	}
	
	

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		new DBConnection().getConnection();
		System.out.println("ok");

	}

}
