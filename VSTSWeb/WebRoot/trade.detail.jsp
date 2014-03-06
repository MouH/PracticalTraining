<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>sc.chinaz.com</title>
<meta name="keywords" content="Business Template, xhtml css, free web design template" />
<meta name="description" content="sc.chinaz.com provided by templatemo.com" />
<link href="css/stock.detail.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript">
function clearText(field){

    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;

}
</script>
</head>
<body>
<div id="templatemo_container">.&nbsp; 
	<!--  站长素材 @ www.TemplateMo.com  -->
    <div id="templatemo_banner">
    	
				 <div id="logo"></div>
				<br />
    </div>
    
    <div id="templatemo_menu_search">
        <div id="templatemo_menu">
            <ul>
                <li><a href="index.jsp" >首页</a></li>
                <li><a href="SaleOrBuyServlet" >股票交易</a></li>
                <li><a href="TradeDetailServlet" class="current">交易明细</a></li>
                <li><a href="AccountServlet">账户信息</a></li>
                <li><a href="register.jsp" >注册用户</a></li>
				<li><a href="ReLoginServlet" class="last">重新登录</a></li>
            </ul>    	
        </div> <!-- end of menu -->

        
        <div class="cleaner"></div>	
	</div>
    
    <div id="templatemo_content">
			<br><br>
			<div >
				<table  border="1" cellpadding="0" bordercolorlight="#999999" bordercolordark="#FFFFFF" cellspacing="0" align="center">

					<tbody>
						<tr align="center">
							<td>序&nbsp;&nbsp;号</td>
							<td>股票代码</td>
							<td>股票名称</td>
							<td>成交价格</td>
							<td>成交数量</td>
							<td>成交类型</td>
							<td>交易时间</td>
						</tr>
						<c:if test="${flag}">
						<tr>
							<td height="50" colspan="8" align="center">对不起，当前没有股票交易记录</td>
						</tr>
						</c:if>
						<c:if test="${flag==false}">
						<c:forEach var="t" items="${trades}" varStatus="dd">
						<tr   onmousemove="color=this.style.backgroundColor;this.style.backgroundColor='rgb(225,225,225)'" style="width: 529px" onmouseout="this.style.backgroundColor='white'">
						<td  align="center">${dd.count}</td>        
    				    <td  align="center" ><c:out value="${t.stock.code}"/> </td>
    				    <td  align="center"><c:out value="${t.stock.name}"/></td>
    				    <td  align="center"><c:out value="${t.tradePrice}"/></td>
    				    <td  align="center"><c:out value="${t.tradeNumber}"/></td>
						<td  align="center"><c:out value="${t.tradetype.info}"/></td>
						<td  align="center"><c:out value="${t.tradeDate}"/></td>
						</tr>
						</c:forEach>
						</c:if>	
					</tbody>
				</table>
				<div class="cleaner"></div>	
			</div>
            </form>	
			<br>   <br>  <br>  <br>
		
				
			
        <br><br><br><br>      <br>  <br>  <br>  <br>  <br>
    
     <div id="templatemo_footer">
        <!--<ul class="footer_list">
            <li><a href="#" class="current">Home</a></li>
            <li><a href="#">About Us</a></li>
            <li><a href="#">Projects</a></li>
            <li><a href="#">Gallery</a></li>
            <li class="last"><a href="#">Contact Us</a></li>
        </ul> -->
        
        <div class="margin_bottom_10"></div>      
    	 版权所有 2012<a href="#">西南财经大学</a>霸王花项目小组 <a href="http://www.swufe.edu.cn/" target="_parent"></a>    </div> 
    <!-- end of footer -->
 
</div>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div></body>
</html>