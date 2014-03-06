<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<% 
String name=request.getParameter("name");
String sex=request.getParameter("sex");
String age=request.getParameter("age");
%>
<table width=268 border=1 cellpadding=0 cellspacing=0>
<tr align=center>
	<td width=63 height=30 >姓名</td>
	<td width=199><%=name%></td>
</tr>
<tr align=center>
	<td width=63 height=30 >年龄</td>
	<td width=199><%=age%></td>
</tr>
<tr align=center>
	<td width=63 height=30 >性别</td>
	<td width=199><%=sex%></td>
</tr>
</table>