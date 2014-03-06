package note;
import java.sql.*;
import javax.sql.*;
import javax.naming.Context;
import javax.naming.InitialContext;


import java.util.*;
import java.util.Date;

public class NotesDao {
	private Connection conn;
	private static final NotesDao Instance=new NotesDao();
	public static NotesDao getInstance(){
		return Instance;
	}
	private NotesDao(){
		Context ctx;
		DataSource dataSource;
		try{
			ctx=new InitialContext();
			dataSource=(DataSource)ctx.lookup("java:comp/env/jdbc/access");
			conn=dataSource.getConnection();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public List<Notes> selectAll(){
		List<Notes> nList=new ArrayList<Notes>();
		String command="select * from notes";
		Statement stmt;
		ResultSet rs;
		Notes note;
		try{
			stmt=conn.createStatement();
			rs=stmt.executeQuery(command);
			while(rs.next()){
				note=new Notes();
				note.setNid(rs.getInt("nid"));
				note.setNcontent(rs.getString("ncontent"));
				note.setNdate(rs.getString("ndate"));
				note.setNuser(rs.getString("nuser"));
				nList.add(note);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return nList;
	}
	public void insert(String nuser,String ncontent){
		Statement stmt;
		Date date=new Date();
		String ndate=(1900+date.getYear())+"-"+(date.getMonth()+1)+"-"+date.getDate();
		String command="insert into notes(ncontent,ndate,nuser) values('"+ncontent+"','"+ndate+"','"+nuser+"')";
		try{
			stmt=conn.createStatement();
			stmt.executeUpdate(command);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void delete(String nid){
		Statement stmt;
		String command="delete from notes where nid="+nid;
		try{
			stmt=conn.createStatement();
			stmt.executeUpdate(command);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
