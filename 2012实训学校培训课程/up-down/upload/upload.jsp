<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

Object obj=request.getAttribute("upfile");
String sta="";
if(obj!=null) {
	if(obj.toString().equals("fail"))
		sta="上传失败！";
	else
		sta="上传成功！";
}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upload.jsp' starting page</title>
    
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
  <form action="servlet/upload" method="post" ENCTYPE="multipart/form-data">
    <table border="0" width="500" align="center">
    <tr><td>选择要上传的文件</td></tr>
    <tr><td>
    	<input type="file" name="upfile" size="30"/></td></tr>
    <tr><td>
    	<input type="submit" value="提交" />
    </td></tr>
     <tr><td>
    	<br>
    </td></tr>
     <tr><td>
    	<%=sta %>
    </td></tr>
    </table>
    </form>
  </body>
</html>
