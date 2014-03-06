<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

Object obj=request.getAttribute("upfile");
String sta="";
if(obj!=null) {
	if(obj.toString().equals("sta"))
		sta="下载失败！";
}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'download.jsp' starting page</title>
    
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
  <br>
  <table width="500" align="center" border=0>
  <tr><td>
    请点击下载文件：<a href="servlet/downloadservlet?file=readme.txt">readme</a> <br>
    </td></tr>
    <tr><td>
    	<%=sta %>
    </td></tr>
  </body>
</html>
