<%@page import ="java.util.*, java.sql.*" contentType="text/html;charset=GBK"%>
<jsp:useBean id="dbconn"  scope="application" class="qjt.DBConn"/>
<%
int id;
String sid;
String title;
String content;
title=request.getParameter("title");
content=request.getParameter("content");
sid=request.getParameter("id");
String sql;

if(sid!=null){
id=Integer.parseInt(sid);
	sql="update paper2 set title='"+title+"', content='"+content+"' where id="+id;
	try{
		dbconn.update(sql);
		response.sendRedirect("display.jsp");
		return;
	}catch(Exception e){
		response.sendRedirect("error.jsp");
		//e.printStackTrace();
	}
}
%>

<html>
<body>
<form action=update.jsp>
<table width="430" border="0" cellpadding="2" cellspacing="1" bgcolor=#999900 align=center>
        <tr>
          <td width="300" align="center" valign="top" bgcolor="#FFFFCC" colspan="4">
           更新记录</td>
          
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">编号：</td>
          <td colspan="3" width="200" align="left" valign="top" bgcolor="#FFFFFF">
          <input type="text" name="id" size=50></td>
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">标题：</td>
          <td colspan="3" align="left" valign="top" bgcolor="#FFFFFF">
          <input type="text" name="title" size=50></td>
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">内容：</td>
          <td colspan="3" align="left" valign="top" bgcolor="#FFFFFF">
          <textarea name="content" id="content" cols="50" rows="15"></textarea></td>
        </tr>
        <tr>
          <td colspan="4" align="center" valign="top" bgcolor="#FFFFFF">
          <input type="submit" name="submit" value="更新记录"></td>
        </tr>
      </table>
</form>
</body>
</html>