<%@ page contentType="text/html; charset=GBK"%>
<jsp:useBean id="vote"  scope="session" class="qjt.VoteBean"/>
<jsp:useBean id="proc"  scope="application" class="qjt.Process"/>
<% 
request.setCharacterEncoding("GBK");
String age=request.getParameter("age");
String sex=request.getParameter("sex");
int iage=0;
if(age==null||sex==null)
	response.sendRedirect("index.jsp");
try{
	iage=Integer.parseInt(age);
}catch(Exception e){
	response.sendRedirect("error.jsp");	
}
vote.setAge(iage);
vote.setSex(sex);
proc.processOneVote(vote); 
%>
<html>
<body>
<br><br>
<center>
���๲��������<%=proc.malenum %>  Ů����<%=proc.femalenum %>  ƽ�����䣺<%=proc.averageAge%><br>
<hr align=center noshade size=1 width=500>
      ���ߵ���  2009.06
</center>
</body>
</html>
