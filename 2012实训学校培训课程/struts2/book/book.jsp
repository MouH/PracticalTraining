<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'book.jsp' starting page</title>
    
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
  <s:if test="blist==null"> 
  		<%response.sendRedirect("book"); %>
  </s:if>
  <s:else>
	  	<table width="500" border="0" cellspacing="1" align="center">
	  		<tr bgcolor="54BBCC"><td colspan="3">图书清单</td></tr>
	  		<tr bgcolor="bbcc77"><td width="50%">书名</td><td width="25%">作者</td><td width="25%">价格</td></tr>
	  			<s:iterator value="blist" status="status">
	  				<tr bgcolor="999999"><td width="50%"><s:property value="bname"/></td>
	  					<td width="25%"><s:property value="bauthor"/></td>
	  					<td width="25%"><s:property value="bprice"/></td></tr>
	  				<br>
  				</s:iterator>
	  	</table>
  		
  
  </s:else>
  </body>
</html>
