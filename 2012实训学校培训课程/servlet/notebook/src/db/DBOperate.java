package db;
import java.sql.*;

public class DBOperate {
	private static final DBOperate Instance=new DBOperate();
	private Connection conn=null;
	
	private DBOperate(){
		conn=null;
	}
	public static DBOperate getInstance(){
		return Instance;
	}
	public void buildConnection(String path){ 
		if (conn!=null)return;
		String driverClass="sun.jdbc.odbc.JdbcOdbcDriver";
		String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};"
			+"DBQ="+path+"notebook.mdb";
		String username="";
		String pwd="";
//		System.out.println(url);
		try{
		Class.forName(driverClass);
		conn=DriverManager.getConnection(url,username,pwd);
		}catch(Exception e){
			e.printStackTrace();
			return;
		}
	}
	public ResultSet select(String sql){
		ResultSet rs;
		Statement stmt;
		try{
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			return rs;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	public void operate(String sql){
		try{
			Statement stmt=conn.createStatement();
			stmt.execute(sql);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
