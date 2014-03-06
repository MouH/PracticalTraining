<%@page import="java.util.*" contentType="text/html;charset=GBK"%>
<html>
	<head>
		<title>登录</title>
		<meta http-equiv="Content-Type" content="text/html; charset=GBK">
	</head>
	<body>
	<form action="dologon.jsp">
	<table>
		<tr><td colspan=2>用户登录</td></tr>
		<tr><td>用户名：</td>
			<td><input type="text" name="name"></td></tr>
		<tr><td>密&nbsp;&nbsp;码：</td>
			<td><input type="text" name="pwd" redisplay="Flase"></td></tr>
		<tr><td coaspan=2>
				<input type="submit" value="登录">
				<input type="reset" value="重置">
			</td></tr>		
	</table>
	</form>
	</body>
</html>
