<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>sc.chinaz.com</title>
<meta name="keywords" content="Business Template, xhtml css, free web design template" />
<meta name="description" content="sc.chinaz.com provided by templatemo.com" />
<link href="css/register.css" rel="stylesheet" type="text/css" />
<script  type="text/javascript">
function clearText(field){

    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;
   }
  function getElementByName(name)
	{
	    var elements = document.getElementsByName(name);
	    return elements[0];
	}
    function validate()
    {
        var element =getElementByName("user.name");
     	var re=/^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]/;
        if(element.value.length == 0)
        {
            alert("请输入用户姓名！");
            element.focus();
            return false;
        }
      if(!re.test(element.value)){
        	alert("请输入正确格式的用户姓名！");
            element.focus();
            return false;
        }
         element = getElementByName("user.passwd");
        if(element.value.length == 0)
        {
            alert("请输入密码！");
            element.focus();
            return false;
        }
      if(!re.test(element.value)){
        	alert("请输入正确格式的密码！");
            element.focus();
            return false;
        }      
       element = getElementByName("user.passwd2");
        if(element.value.length == 0)
        {
            alert("请输入确认密码！");
            element.focus();
            return false;
        }
      
        if(element.value != getElementByName("user.passwd").value)
        {
            alert("确认密码和原始密码不一致！");
            element.select();
            return false;
        }       
       
     element = getElementByName("user.email");
        if(element.value.length == 0)
        {
            alert("请输入用户邮箱！");
            element.focus();
            return false;
        }
        var regex=/^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/gi;
        // String regex= "\\w{1,}@\\w{1,}\56\\w{1,}";
        if(!regex.test(element.value))
        {
            alert("请输入正确格式的邮箱地址");
            element.focus();
            return false;
        }
     element = getElementByName("user.phone");
        if(element.value.length == 0)
        {
            alert("请输入用户电话！");
            element.focus();
            return false;
        }
        element = getElementByName("user.address");
        if(element.value.length == 0)
        {
            alert("请输入用户联系地址！");
            element.focus();
            return false;
        }    
         return true; 

}
</script>
</head>
<body>
<div id="templatemo_container">
	<!--  站长素材 @ www.TemplateMo.com  -->
    <div id="templatemo_banner">
    	<div id="logo"></div>
    </div>
    
    <div id="templatemo_menu_search">
        <div id="templatemo_menu">
            <ul>
                <li><a href="index.jsp" >首页</a></li>
                <li><a href="SaleOrBuyServlet">股票交易</a></li>
                <li><a href="TradeDetailServlet">交易明细</a></li>
                <li><a href="AccountServlet">账户信息</a></li>
                <li><a href="register.jsp" class="current">注册用户</a></li>
				<li><a href="ReLoginServlet" class="last">重新登录</a></li>
            </ul>    	
        </div> <!-- end of menu -->
        

        
        <div class="cleaner"></div>	
	</div>
    
    <div id="templatemo_content">
    	<div style="width:950px;height:250px;margin:0 auto 5px;">
		<form onsubmit="return validate()" method="post" action="RegisterServlet">
			<table border="1" align="center" width="80%">
				<tbody>
					<tr>
						<td align="left" width="150">用户姓名<font color="red">*</font></td>
						<td width="250"> <input type="text" name="user.name" size="25"/> </td>
						<td align="center" width="300"><font color="red">  请输入用户的登陆名称（只限字母，数字，特殊符号） </font></td>
					</tr>
					<tr></tr>
					<tr>
						<td align="left" width="150">登陆密码<font color="red">*</font></td>
						<td width="250"> <input type="password" name="user.passwd" size="25"/> </td>
						<td align="center" width="300"><font color="red">   请输入用户的登陆密码（只限字母，数字，特殊符号）</font></td>
					</tr>
					<tr>
						<td align="left" width="150">重复密码<font color="red">*</font></td>
						<td width="250"> <input type="password" name="user.passwd2" size="25"/> </td>
						<td align="center" width="300"> <font color="red">  请重复输入以上密码</font></td>
					</tr>
					<tr>
						<td align="left" width="150">邮&nbsp;&nbsp;&nbsp;&nbsp;箱<font color="red">*</font></td>
						<td width="250"> <input type="text" name="user.email" size="25"/> </td>
						<td align="center" width="300"> <font color="red">   请输入邮箱信息</font></td>
					</tr>
					<tr>
						<td align="left" width="150">联系电话</td>
						<td width="250"> <input type="text" name="user.phone" size="25"/> </td>
						<td align="center" width="300">  <font color="red">  请输入联系电话</font></td>
					</tr>
					<tr>
						<td align="left" width="150">地址</td>
						<td width="250"> <input type="text" name="user.address" size="25"/> </td>
						<td align="center" width="300">  <font color="red">  请输入联系地址</font></td>
					</tr>


				</tbody>
			</table>

			<p align="center">
				<input type="submit" value="确 定" onclick="validate()"/>
					&nbsp;&nbsp;&nbsp;
				<input type="button" value=" 取 消"/>
			</p>
		</form>
	</div>
 
    </div>
    
    <div id="templatemo_footer">
        <ul class="footer_list">
            <li><a href="#" class="current">Home</a></li>
            <li><a href="#">About Us</a></li>
            <li><a href="#">Projects</a></li>
            <li><a href="#">Gallery</a></li>
            <li class="last"><a href="#">Contact Us</a></li>
        </ul> 
        
        <div class="margin_bottom_10"></div>      
    	Copyright © 2024 <a href="#">Your Company Name</a> | Designed by <a href="http://sc.chinaz.com/" target="_parent">站长素材</a>    </div> 
    <!-- end of footer -->
<!--  Free Website Templates @ TemplateMo.com  -->
</div>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div></body>
</html>