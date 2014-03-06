package search;

import java.sql.*;

/**
 * connect to Access Database
 * 采用Singleton模式
 * 
 * @author Qiu
 * @since 2010.04.11
 * */
public class OperateDB {
	private Connection connection;
	private Statement statement,statement2,statement3;
	
	private static final OperateDB Instance=new OperateDB();
	
	private OperateDB(){
		connection=null;
	}
	public static OperateDB getInstance(){
		return Instance;
	}
	public void connect(){
		String username;
		String password;
		String url;
		if (connection!=null) return;                             //如果已经建立了连接，则不执行连接操作
		try {
	    	 
			String driverClass="sun.jdbc.odbc.JdbcOdbcDriver";
		    Class.forName(driverClass);
		     
	     }
	     catch (Exception e) {
	         System.out.println(
	         "Unable to register the JDBC Driver.\n" +
	         "Make sure the JDBC driver is in the\n" +
	         "classpath.\n");
	         System.exit(1);
	     }
	    
	     try {
	    	 String path=System.getProperty("user.dir");
	    	 url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};"
			    				+"DBQ="+path+"/swem.mdb";
	    	 System.out.println(path);
			 username="";
			 password="";
	         connection = DriverManager.getConnection(url, username, password);
	     }
	     catch (SQLException e) {
	         System.out.println(
	         "Unable to make a connection to the database.\n" +
	         "The reason: " + e.getMessage());
	         System.exit(1);
	         return;
	     }
	    
	}
	public void connect(String DBName){
		String username;
		String password;
		try {
	    	 
	    	 Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
	     }
	     catch (Exception e) {
	         System.out.println(
	         "Unable to register the JDBC Driver.\n" +
	         "Make sure the JDBC driver is in the\n" +
	         "classpath.\n");
	         System.exit(1);
	     }

	     String url="jdbc:microsoft:sqlserver://localhost:1433;DatabaseName="+DBName; 
	     username = "sa";
	     password = "123456";
	     try {
	         connection = DriverManager.getConnection(url, username, password);
	         statement=connection.createStatement();
	         statement2=connection.createStatement();
	         statement3=connection.createStatement();
//	         System.out.println("open!");
	     }
	     catch (SQLException e) {
	         System.out.println(
	         "Unable to make a connection to the database.\n" +
	         "The reason: " + e.getMessage());
	         System.exit(1);
	         return;
	     }
	    
	}
	/**
	 * disconnect from db
	 * */
	public void disconnect(){
//		System.out.println("close!");
		 try{
			 if (statement!=null)
			    statement.close(); 
			 if (statement2!=null)
				    statement2.close(); 
			 if (statement3!=null)
				    statement3.close(); 
		     if (connection!=null)
			    connection.close();
		 }
		 catch(SQLException e){}
	 }
	/**
	 * 插入、更新、删除操作数据
	 * */
	public boolean operate(String command) throws Exception{
		
		statement2.executeUpdate(command);
		return true;
    }
	/**
	 * return query result
	 * */
	public ResultSet select(String command)throws Exception{
		ResultSet rs=statement.executeQuery(command);
		return rs;
	}
	public ResultSet select2(String command)throws Exception{
		ResultSet rs=statement2.executeQuery(command);
		return rs;
	}
	public ResultSet select3(String command)throws Exception{
		ResultSet rs=statement3.executeQuery(command);
		return rs;
	}
}