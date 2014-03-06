<%@page import ="java.util.*" contentType="text/html;charset=GBK"%>
<% 
String user=request.getParameter("user");
String pwd=request.getParameter("pwd");
if(user!=null&&pwd!=null){
	session.setAttribute("user",user);
	session.setAttribute("pwd",pwd);
	response.sendRedirect("first.jsp");
} %>
<html>
<body>
<form action=logon.jsp>
<table width="300" border="0" cellpadding="2" cellspacing="1" bgcolor=#999900 align=center>
        <tr>
          <td width="300" align="center" valign="top" bgcolor="#FFFFCC" colspan="2">
           登录界面</td>
          
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">用户名：</td>
          <td width="200" align="left" valign="top" bgcolor="#FFFFFF">
          <input type="text" name="user"></td>
        </tr>
        <tr>
          <td align="right" valign="top" bgcolor="#FFFFCC" class="smallText">密码：</td>
          <td colspan="3" align="left" valign="top" bgcolor="#FFFFFF">
          <input type="text" name="pwd"></td>
        </tr>
        <tr>
          <td colspan="3" align="center" valign="top" bgcolor="#FFFFFF">
          <input type="submit" name="submit"></td>
        </tr>
      </table>
</form>
</body>
</html>