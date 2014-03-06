<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>sc.chinaz.com</title>
<meta name="keywords" content="Business Template, xhtml css, free web design template" />
<meta name="description" content="sc.chinaz.com provided by templatemo.com" />
<link href="css/account.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript">
function clearText(field){

    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;

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
                <li><a href="AccountServlet" class="current">账户信息</a></li>
                <li><a href="register.jsp" >注册用户</a></li>
				<li><a href="ReLoginServlet" class="last">重新登录</a></li>
            </ul>    	
        </div> <!-- end of menu -->
        

        
        <div class="cleaner"></div>	
	</div>
    
    <div id="templatemo_content">
    
			<table border="1" align="center" width="60%">
				<tr>
					<td align="left" width="150" >用户姓名</td>
					<td width="250"  > ${u.name}  </td>
				</tr>
				
				<tr>
					<td align="left" width="150" >登陆密码</td>
					<td width="250"  > ${u.passwd} </td>
				</tr>

				<tr>
					<td align="left" width="150" >邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱</td>
					<td width="250"  >${u.email } </td>
				</tr>

				<tr>
					<td align="left" width="150" >联系电话</td>
					<td width="250"  > ${u.phone }</td>
				</tr>

				<tr>
					<td align="left" width="150" >注册日期</td>
					<td width="250"  > ${u.reg_date } </td>
				</tr>


			</table>

		
 
    </div>
    
    <div id="templatemo_footer">
        <ul class="footer_list">
            <li><a href="#" class="current" >Home</a></li>
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