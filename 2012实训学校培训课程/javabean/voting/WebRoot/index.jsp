<%@ page import="java.util.*" contentType="text/html;charset=GBK"%>

<html>
  <head>
    <title>在线调查</title>
  </head>
  
  <body>
  <form action="second.jsp" method=post name="vote">
    <table align="center" width="319" border="0" cellpadding="2" cellspacing="1" bgcolor=#999900 height="93" style="width: 319px; height: 93px;">
        <tr>
          <td width="100" align="right" valign="top" bgcolor="#99dfff" class="smallText">性别：</td>
          <td colspan="4" align="left" valign="top" bgcolor="#FFFFFF">
		  	<input type="radio" name=sex value=male checked>男
            <input type="radio" name=sex value=female>女
		  </td>
        </tr>
       
         <tr>
          <td align="right" valign="top" bgcolor=#99dfff class="smallText">年龄：</td>
          <td colspan="4" width="200" align="left" valign="top" bgcolor="#FFFFFF">
          	<input type="text" name="age" size=30>
          </td>
        </tr>
        <tr><td colspan="5"  bgcolor=#ffffff>
          	<table align="center" border="0" cellpadding="2" cellspacing="1" bgcolor=#ffffff style="width: 197px; height: 30px;">
          	<tr>
          		<td colspan="4" align="center" valign="top" >
          			<input type="submit" value="submit" name=a size=30>
          		</td>
          	</tr></table>
        </td>
        </tr>
        
      </table><br>
      <hr align=center noshade size=1 width=500>
      <center>在线调查  2009.06 </center>
  </form>
  </body>
</html>
