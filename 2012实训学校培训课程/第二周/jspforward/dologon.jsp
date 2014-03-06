<%@page import="java.util.*" contentType="text/html;charset=GBK"%>
<% 
String name=request.getParameter("name");
String pwd=request.getParameter("pwd");
%>
<% if(name.equals("")||pwd.equals("")){%>
   <jsp:forward page="false.jsp"/>
<%}else{%>
	<jsp:forward page="success.jsp">
		<jsp:param name="username" value="<%=name %>"/>
		<jsp:param name="userpwd" value="<%=pwd %>"/>
	</jsp:forward>
<% }%>