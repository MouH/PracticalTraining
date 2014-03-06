<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.ambow.vsts.entity.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%
	//User user = (User)request.getAttribute("user");
	String age = (String)session.getAttribute("age");
	//out.println(user.getName()+","+
	//	user.getEmail()+","+age);
	
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
<h2>
${user[1].name},${user[1].email},${age}
<br/>

<c:out value="${user[1].name}"></c:out>

</h2>
<h3 style="color:blue">
<c:forEach  var="u"   items="${user}">
	<c:out value="${u.name}"/>;
	<c:out value="${u.email}"/><br/>
</c:forEach>
</h3>




</body>
</html>







