<%@page import ="java.util.*,java.sql.*" contentType="text/html;charset=GBK"%>
<jsp:useBean id="dbconn"  scope="application" class="qjt.DBConn"/>
<%
String path=request.getRealPath("")+"/db";
dbconn.buildConnection(path);
String sql="select * from paper2";
ResultSet rs=dbconn.select(sql);
%>

<html>
<body>
<a href=insert.jsp>Insert</a><br><a href=update.jsp>update</a>
<%
int i=0;
int sid=0;
while (rs.next()){	
	sid=rs.getInt(1);%>
 <table align=center width="600" border="0" cellpadding="2" cellspacing="1" bgcolor=#999900>
        <tr>
          <td width="100" align="right" valign="top" bgcolor="#FFFFCC" class="smallText">
           ±àºÅ£º</td>
          <td bgcolor="#FFFFCC">
          	<table bgcolor=#FFFFCC><tr>
          		<td width=100  align="left" valign="top" bgcolor="#FFFFCC"><%=sid%></td>
          		<td width=300 align="right" bgcolor="#FFFFCC"><a href=delete.jsp?id=<%=sid%>&user=qjt>delete</a></td>
          	</tr></table>
          </td>
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">title£º</td>
          <td width="200" align="left" valign="top" bgcolor="#FFFFFF"><%=rs.getString("title") %></td>
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">ÄÚÈÝ£º</td>
          <td colspan="3" align="left" valign="top" bgcolor="#FFFFFF"><%=rs.getString("content") %></td>
        </tr>
      </table><br>
<% 
i++;
}
rs.close();%>
</body>
</html>
