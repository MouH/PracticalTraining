package day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo2 {

	public static void main(String[] args) throws ClassNotFoundException, 
		SQLException {
		//装载驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		//获得联接对象
		String url = "jdbc:mysql://localhost/vsts";
		String user = "root";
		String password = "root";
		Connection conn = 
			DriverManager.getConnection(url, user, password);
		String sql = "select * from user";
		PreparedStatement prep = conn.prepareStatement(sql);
		//执行SQL语句
		ResultSet rs = prep.executeQuery();
		//rs.next方法:判断下一行有无记录，无，返回false
		//有，移动指针到下一行，返回true
		while(rs.next()) {
			//取某一列的数据:rs.getXxx("列名"),列对应的数据类型
			int id = rs.getInt("user_id");
			String name = rs.getString("name");
			System.out.println(id+","+name);
		}
		
		//关闭资源
		rs.close();
		prep.close();
		conn.close();
		
	}

}
