package qjt;
import java.sql.*;
public class DBConn {
	private Connection conn=null;
//	public static void main(String args[]){
//		DBConn dc=new DBConn();
//		dc.getConnection();
//	}
	public void buildConnection(String path){ 
		if (conn!=null)return;
		String driverClass="sun.jdbc.odbc.JdbcOdbcDriver";
		
		String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};"
						+"DBQ="+path+"/doc.mdb";
		String username="";
		String pwd="";
		System.out.println(url);
		try{
			Class.forName(driverClass);
			conn=DriverManager.getConnection(url,username,pwd);
		}catch(Exception e){
			e.printStackTrace();
			return;
		}
	}
	public ResultSet select(String sql)throws Exception{ 
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		return rs;
	}
	public void insert(String sql)throws Exception{
		Statement stmt=conn.createStatement();
		stmt.executeUpdate(sql);
	}
	public void update(String sql)throws Exception{
		Statement stmt=conn.createStatement();
		stmt.executeUpdate(sql);
	}
	public void delete(String sql)throws Exception{
		Statement stmt=conn.createStatement();
		stmt.executeUpdate(sql);
	}
}
