<%@page import ="java.util.*,java.sql.*" contentType="text/html;charset=GBK"%>
<%
String driverClass="sun.jdbc.odbc.JdbcOdbcDriver";
String path=request.getRealPath("");
%>
<%
String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};"
				+"DBQ="+path+"/db/doc.mdb";
String username="";
String pwd="";
Class.forName(driverClass);
Connection conn=DriverManager.getConnection(url,username,pwd);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery("select * from paper2");
%>

<html>
<body>
<%
int i=0;
int sid=0;
while (rs.next()){	
	sid=rs.getInt(1);%>
 <table width="600" border="0" cellpadding="2" cellspacing="1" bgcolor=#999900>
        <tr>
          <td width="100" align="right" valign="top" bgcolor="#FFFFCC" class="smallText">
           ±àºÅ£º</td>
          <td bgcolor="#FFFFCC">
          	<table bgcolor=#FFFFCC><tr>
          		<td width=100  align="left" valign="top" bgcolor="#FFFFCC"><%=sid%></td>
          		<td width=300 align="right" bgcolor="#FFFFCC"><a href=delete.jsp?id=<%=sid%>>É¾³ý¼ÇÂ¼</a></td>
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
}%>
</body>
</html>
