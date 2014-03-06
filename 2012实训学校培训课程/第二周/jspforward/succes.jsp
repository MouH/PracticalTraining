<%@page import="java.util.*" contentType="text/html;charset=GBK"%>
<% 
	String username=request.getParameter("username");
	String userpwd=request.getParameter("userpwd");
	if (username==null) username="";
	username=new String(username.getBytes("ISO-8859-1"),"gbk");
	if (userpwd==null) userpwd="";
	userpwd=new String(userpwd.getBytes("ISO-8859-1"),"gbk");
%>
<table>
	<tr><td>»¶Ó­µÇÂ¼</td></tr>
	<tr><td><b>ÓÃ»§Ãû£º<%=username %></b><b>ÃÜÂë:<%=userpwd %></b></td></tr>
</table>