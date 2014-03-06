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
    
    	<div class="section_w650 fl">
        	<div id="welcome_title"></div>
			<div>	
			<form onsubmit="return  myfu()" action="http://172.7.43.52:8089/VSTS1.0/manager/stock.do?method=buyStock" method="post">

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
			</div>
            </form>	
			<br>
			</div>
				
			
            <div class="margin_bottom_30 border_bottom"></div>
            <div class="margin_bottom_30"></div>
            
            <div id="project_title"></div>
            
            <div class="section_w200 fl margin_right_25">
            	
                <div class="image_wrapper_01">
                	<a href="#"><img src="images/templatemo_image_01.jpg" alt="image" /></a>                </div>
                
              <div class="header_02">Aliquam tristique lacus in sapien</div>
                <p>Fusce tempor orci a nisi sollicitudin et vehicula dui lacinia. Mauris at nisi vel dolor dapibus pharetra.</p>
                <div class="margin_bottom_10"></div>
                <div class="rc_btn_01"><a href="#"></a></div>
            
            </div>
            
            <div class="section_w200 fl margin_right_25">
            	
                <div class="image_wrapper_01">
                	<a href="#"><img src="images/templatemo_image_03.jpg" alt="image" /></a>                </div>
                
              <div class="header_02">Duis suscipit leo vitae urna</div>
                <p>Nulla nunc turpis, mollis vitae vehicula vel, dapibus sed nisl. Nulla odio ligula, interdum in tempus quis ac.</p>
                <div class="margin_bottom_10"></div>
                <div class="rc_btn_01"><a href="#"></a></div>
            
            </div>
            
            <div class="section_w200 fl">
            	
                <div class="image_wrapper_01">
                	<a href="#"><img src="images/templatemo_image_02.jpg" alt="image" /></a>                </div>
                
              <div class="header_02">Proin scelerisque risus vel </div>
                <p>Phasellus congue volutpat blandit. Duis massa lacus, tincidunt vel varius quis, mollis at justo.</p>
                <div class="margin_bottom_10"></div>
                <div class="rc_btn_01"><a href="#"></a></div>
            
            </div>
           
			<div class="cleaner"></div>
        </div> <!-- end of section 650 left column -->
        
        <div class="section_w270 fr">
        	
            <div id="news_events_title"></div>
            
            <div id="news_events_section_wrapper">
            
            	<div class="news_events_section">
                    <div class="date">OCT 28</div>
                    <div class="short_note">Phasellus ligula augue, vestibulum in, cursus non, euismod et, pede.</div>
                    
                    <div class="cleaner"></div>
				</div>
                
                <div class="margin_bottom_15"></div>
                                
                <div class="news_events_section">
                    <div class="date">OCT 26</div>
                    <div class="short_note">Donec ac felis quis in non lectus in erat rutrum aliquam nec non tortor. </div>
                    
                    <div class="cleaner"></div>
				</div>
                
                <div class="margin_bottom_15"></div>
                
                <div class="news_events_section">
                    <div class="date">OCT 22</div>
                    <div class="short_note">Aliquam vitae urna quis mi faucibus dapibus quis venenatis metus. </div>
                    
                    <div class="cleaner"></div>
				</div>
            </div>
            
            <div class="margin_bottom_30 border_bottom"></div>
            <div class="margin_bottom_30"></div>
            
            <div id="contact_title"></div>
            <ul class="contact_info_list" >
            	<li><span>Tel:</span> 		010-100-1010, 050-500-5050</li>
				<li><span>Mobile:</span>		030-300-3000 &nbsp;&nbsp;Fax: 020-200-2000</li>
				<li><span>Email:</span> 		info [at] templatemo [dot] com</li>
				<li><span>Website:</span> 	<a href="http://sc.chinaz.com/" target="_parent">www.templatemo.com</a></li>
            </ul>
            
          <div class="margin_bottom_30 border_bottom"></div>
            <div class="margin_bottom_30"></div>
            
            <a href="http://validator.w3.org/check?uri=referer"><img style="border:0;width:88px;height:31px" src="http://www.w3.org/Icons/valid-xhtml10" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>
                <a href="http://jigsaw.w3.org/css-validator/check/referer"><img style="border:0;width:88px;height:31px"  src="http://jigsaw.w3.org/css-validator/images/vcss-blue" alt="Valid CSS!" vspace="8" border="0" /></a>
            
        </div> <!-- end of section 270  rigth column -->
        
		<div class="cleaner"></div>    
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