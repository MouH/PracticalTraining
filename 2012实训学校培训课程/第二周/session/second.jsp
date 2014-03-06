<%@page import ="java.util.*" contentType="text/html;charset=GBK"%>
<%
String user=(String)session.getAttribute("user");
String pwd=(String)session.getAttribute("pwd");
if(user==null||pwd==null){
%>
	<jsp:forward page="logon.jsp"/>
<%}%>
This is Second Page