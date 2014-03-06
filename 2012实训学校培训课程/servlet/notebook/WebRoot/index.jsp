<%@ page language="java" import="java.util.*,bean.*;" pageEncoding="GBK"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
Object obj=request.getAttribute("list");
Collection<Record> list;
Iterator it;
int i=1;
Record record;
if (obj==null){
 	response.sendRedirect("operate");
 	list=null;
}else{
	list=(Collection<Record>)obj;
}
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>留言本</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <center><centern><H1>我的留言簿</H1></center>
  <hr width=90%>
  <% if (list==null){%>
  
 <span> 留言簿中无记录！</span>
 <%}else{ 
 		it=list.iterator();
 		while(it.hasNext()){
 			record=(Record)it.next();
 %>
  <table width="600" border="0" cellpadding="2" cellspacing="1" bgcolor=#999900 align=center>
        <tr>
          <td width="100" align="right" valign="top" bgcolor="#FFFFCC" class="smallText">
           编号：</td>
          <td bgcolor="#FFFFCC">
          	<table bgcolor=#FFFFCC><tr>
          		<td width=100  align="left" valign="top" bgcolor="#FFFFCC"><%=i++%></td>
          		<td width=300 align="right" bgcolor="#FFFFCC"><a href="operate?optype=2&uid=<%=record.uid %>">delete</a></td>
          	</tr></table>
          </td>
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">User：</td>
          <td width="200" align="left" valign="top" bgcolor="#FFFFFF"><%=record.uname %></td>
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">内容：</td>
          <td colspan="3" align="left" valign="top" bgcolor="#FFFFFF"><%=record.ucontent %></td>
        </tr>
      </table><br>
  <%} }%>
   <hr width=90%>
   <form action="operate" method="post">
   <table width="500" border="0" cellpadding="2" cellspacing="1" bgcolor=#999900 align=center>
   		<tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">User：</td>
          <td align="left" valign="top" bgcolor="#FFFFFF">
          <input type="text" name="uname" size="60"></td>
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">内容：</td>
          <td align="left" valign="top" bgcolor="#FFFFFF">
          <textarea name="ucontent" cols="50" rows="15"></textarea></td>
        </tr>
        <tr>
          <td colspan="2" align="center" valign="top" bgcolor="#FFFFFF">
          <input type="submit" name="submit" value="我要留言"></td>
        </tr>
      </table>
      <input type="hidden" name="optype" id="optype" value="3">
      </form>
  </body>
</html>
