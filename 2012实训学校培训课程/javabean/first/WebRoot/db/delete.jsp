<%@page import ="java.util.*,java.sql.*" contentType="text/html;charset=GBK"%>
<jsp:useBean id="dbconn"  scope="application" class="qjt.DBConn"/>
<%
String path=request.getRealPath("")+"/db";
String id=request.getParameter("id");
if(id==null){
	response.sendRedirect("display.jsp");
	return;
}
String sql="delete from paper2 where id="+id;
try{
	dbconn.buildConnection(path);
	dbconn.delete(sql);
}catch(Exception e){
	response.sendRedirect("error.jsp");
	return;
}
%>
<jsp:forward page="display.jsp"/>