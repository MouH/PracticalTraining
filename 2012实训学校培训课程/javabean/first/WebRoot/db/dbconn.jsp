<%@page import ="java.util.*,java.sql.*" contentType="text/html;charset=GBK"%>
<%
String driverClass="sun.jdbc.odbc.JdbcOdbcDriver";
String path=request.getRealPath("");
String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};"
				+"DBQ="+path+"/doc.mdb";
String username="";
String pwd="";
Class.forName(driverClass);
Connection conn=DriverManager.getConnection(url,username,pwd);
session.setAttribute("dbconn",conn);
%>
