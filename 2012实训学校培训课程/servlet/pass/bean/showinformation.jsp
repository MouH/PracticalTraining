<%@ page language="java" import="java.util.*,servlet.*" pageEncoding="GBK"%>
<% 
UserInfo ui=(UserInfo)request.getAttribute("user");
%>
<table width=268 border=1 cellpadding=0 cellspacing=0>
<tr align=center>
	<td width=63 height=30 >姓名</td>
	<td width=199><%=ui.getName()%></td>
</tr>
<tr align=center>
	<td width=63 height=30 >年龄</td>
	<td width=199><%=ui.getAge()%></td>
</tr>
<tr align=center>
	<td width=63 height=30 >性别</td>
	<td width=199><%=ui.getSex()%></td>
</tr>
</table>