<%@ page language="java" import="qjt.PassUser" pageEncoding="GBK"%>
<% 
request.setCharacterEncoding("GBK");
String user=request.getParameter("user");
String pwd=request.getParameter("pwd");
PassUser puser=new PassUser();
puser.setPwd(pwd);
puser.setUser(user);
session.setAttribute("user",user);
response.sendRedirect("showinfo.jsp");
%>