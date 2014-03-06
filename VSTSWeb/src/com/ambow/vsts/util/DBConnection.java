package com.ambow.vsts.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public Connection getConnection() throws Exception {
		//װ�������
		Class.forName("com.mysql.jdbc.Driver");
		//������Ӷ���
		String url = "jdbc:mysql://localhost/vsts";
		String user = "root";
		String password = "123456";
		return 
			DriverManager.getConnection(url, user, password);
	}
	
	

//	public static void main(String[] args) throws Exception {
//		new DBConnection().getConnection();
//		//System.out.println("ok");

//	}

}
