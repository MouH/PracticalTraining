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
String path=request.getRealPath("")+"/db";
	
if(title!=null&&content!=null&&sid!=null){
	id=Integer.parseInt(sid);
	sql="insert into paper2(id,title,content) values("+sid+",'"+title+"','"+content+"')";
	try{
		dbconn.buildConnection(path);
		dbconn.insert(sql);
		response.sendRedirect("display.jsp");
		return;
	}catch(Exception e){
		response.sendRedirect("error.jsp");
		return;
	}
}
%>

<html>
<body>
<form action=insert.jsp>
<table width="500" border="0" cellpadding="2" cellspacing="1" bgcolor=#999900 align=center>
        <tr>
          <td width="300" colspan="4" align="center" valign="top" bgcolor="#FFFFCC" colspan="2">
           插入记录</td>
          
        </tr>
        <tr>
          <td  align="right" valign="top" bgcolor="#FFFFCC" class="smallText">编号：</td>
          <td width="200" align="left" valign="top" bgcolor="#FFFFFF">
          <input type="text" name="id" size=60></td>
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">标题：</td>
          <td colspan="3" align="left" valign="top" bgcolor="#FFFFFF">
          <input type="text" name="title" size=60></td>
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">内容：</td>
          <td colspan="3" align="left" valign="top" bgcolor="#FFFFFF">
          <textarea name="content" id="content" cols="50" rows="15"></textarea></td>
        </tr>
        <tr>
          <td colspan="4" align="center" valign="top" bgcolor="#FFFFFF">
          <input type="submit" name="submit" value="插入记录"></td>
        </tr>
      </table>
</form>
</body>
</html>