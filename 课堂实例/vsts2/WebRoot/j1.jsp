<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%
	int i = 10;
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	out.println("name="+name+",age="+age);
	
	//response.sendRedirect("index.jsp");
	
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
function check() {
	alert("ok:<%=i%>")
}

</script>


</head>
<body>
<%
	String s = "HelloWorld";
	//out内置对象
	out.println(s);
%>
<%=s%>

<input type="button" value="确定" onclick="check()"/>

</body>
</html>







