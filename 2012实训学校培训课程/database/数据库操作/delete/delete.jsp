<%@page import ="java.util.*,java.sql.*" contentType="text/html;charset=GBK"%>
<%
String id=request.getParameter("id");
String driverClass="sun.jdbc.odbc.JdbcOdbcDriver";
String path=request.getRealPath("");
String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};"
				+"DBQ="+path+"/db/doc.mdb";
String username="";
String pwd="";
Class.forName(driverClass);
Connection conn=DriverManager.getConnection(url,username,pwd);
session.setAttribute("dbconn",conn);
Statement stmt=conn.createStatement();
if(id!=null)
	//out.print(id);
	stmt.executeUpdate("delete from paper2 where id="+id);
%>
<jsp:forward page="display2.jsp"/>