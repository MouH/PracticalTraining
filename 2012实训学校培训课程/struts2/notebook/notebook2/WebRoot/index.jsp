<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<s:if test="nlist==null">
	<% String p=basePath+"select";
	   response.sendRedirect(p); %>
</s:if>
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
	<meta  http-equiv="content-type" content="text/html;charset=GBK"> 
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <center><centern><H1>我的留言簿</H1></center>
  <hr width="60%">
  <s:if test="nlist.size()==0">
	<center><span> 留言簿中无记录！</span></center>
  </s:if>
  <s:else>
  	<% int i=1;%>
	<s:iterator value="nlist">
  <table width="600" border="0" cellpadding="2" cellspacing="1" bgcolor=#999900 align=center>
        <tr>
          <td width="100" align="right" valign="top" bgcolor="#FFFFCC" class="smallText">
           编号：</td>
          <td bgcolor="#FFFFCC">
          	<table bgcolor=#FFFFCC><tr>
          		<td width=100  align="left" valign="top" bgcolor="#FFFFCC"><%=i++%></td>
          		<td width=250  align="left" valign="top" bgcolor="#FFFFCC"><s:property value='ndate'/></td>
          		<td width=50 align="right" bgcolor="#FFFFCC"><a href="delete?nid=<s:property value='nid'/>">delete</a></td>
          	</tr></table>
          </td>
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">User：</td>
          <td width="200" align="left" valign="top" bgcolor="#FFFFFF"><s:property value='nuser'/></td>
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">内容：</td>
          <td colspan="3" align="left" valign="top" bgcolor="#FFFFFF"><s:property value='ncontent'/></td>
        </tr>
      </table><br>
      </s:iterator>
 </s:else>
   <hr width=60%>
   <form action="insert" method="post">
   <table width="500" border="0" cellpadding="2" cellspacing="1" bgcolor=#999900 align=center>
   		<tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">User：</td>
          <td align="left" valign="top" bgcolor="#FFFFFF">
          <input type="text" name="nuser" size="60"></td>
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">内容：</td>
          <td align="left" valign="top" bgcolor="#FFFFFF">
          <textarea name="ncontent" cols="50" rows="15"></textarea></td>
        </tr>
        <tr>
          <td colspan="2" align="center" valign="top" bgcolor="#FFFFFF">
          <input type="submit" name="submit" value="我要留言"></td>
        </tr>
      </table>
      </form>
  </body>
</html>
