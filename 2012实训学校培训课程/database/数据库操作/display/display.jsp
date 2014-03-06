<%@page import ="java.util.*,java.sql.*" contentType="text/html;charset=GBK"%>
<%
String driverClass="sun.jdbc.odbc.JdbcOdbcDriver";
String path=request.getRealPath("");
String url="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};"
				+"DBQ="+path+"/doc.mdb";
String username="";
String pwd="";
Class.forName(driverClass);
Connection conn=DriverManager.getConnection(url,username,pwd);
session.setAttribute("dbconn",conn);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery("select * from paper");
%>
<html>
<body>
<%
int i=0;
while (rs.next()){%>	 
 <table width="600" border="0" cellpadding="2" cellspacing="1" bgcolor=#999900>
        <tr>
          <td width="100" align="right" valign="top" bgcolor="#FFFFCC" class="smallText">
           Ê±¼ä£º</td>
          <td colspan="3" align="left" valign="top" bgcolor="#FFFFFF"><%=rs.getInt(2)+":"+rs.getInt(3) %></td>
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">title£º</td>
          <td width="200" align="left" valign="top" bgcolor="#FFFFFF"><%=rs.getString(4) %></td>
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
