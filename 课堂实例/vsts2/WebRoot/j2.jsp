<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.ambow.vsts.entity.*" %>

<%@ page import="java.util.*" %>
<%
	User u = new User();
	u.setName("alice");
	u.setEmail("a@sina.com");
	User u1 = new User();
	u1.setName("alice2");
	u1.setEmail("a@tom.com");
	
	List<User> users = new ArrayList<User>();
	users.add(u);
	users.add(u1);

	request.setAttribute("user",users);
	session.setAttribute("age","10");
	request.getRequestDispatcher("j3.jsp").
		forward(request,response);

	//response.sendRedirect("j3.jsp");
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>

</script>


</head>
<body>

<a href="j3.jsp">j3</a>


</body>
</html>







