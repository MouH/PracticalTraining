<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<jsp:useBean id="test"  scope="page" class="qjt.testbean"/>
<jsp:setProperty name="test" property="name" value="Çñ½­ÌÎ"/>
<jsp:getProperty name="test" property="name"/>
<%
out.println("<br>"+test.print());
session.removeAttribute("test");
%>