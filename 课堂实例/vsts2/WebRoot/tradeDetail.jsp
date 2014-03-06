<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<style type="text/css">
.secondaryHeader{height:33px;overflow:hidden;background:url(http://i2.sinaimg.cn/dy/images/header/2008/standardl2nav_bg.gif) repeat-x #fff;color:#000;font-size:12px;font-weight:100;}
.secondaryHeader img{border:none;}
.secondaryHeader a,.secondaryHeader a:visited{color:#000;text-decoration:none;}
.secondaryHeader a:hover,.secondaryHeader a:active{color:#c00;text-decoration:underline;}
.sHBorder{border:1px #e3e3e3 solid;padding:0 10px 0 12px;overflow:hidden;zoom:1;}
.sHLogo{float:left;height:31px;line-height:31px;overflow:hidden;}
.sHLogo span,.sHLogo span a,.sHLogo span a:link,.sHLogo span a:visited,.sHLogo span a:hover{display:block;*float:left;display:table-cell;vertical-align:middle;*display:block;*font-size:27px;*font-family:Arial;height:31px;}
.sHLogo span,.sHLogo span a img,.sHLogo span a:link img,.sHLogo span a:visited img,.sHLogo span a:hover img{vertical-align:middle;}
.sHLinks{float:right;line-height:31px;}
</style>

<DIV class=secondaryHeader style="MARGIN: 0px auto; WIDTH: 950px">
<DIV class=sHBorder>
<DIV class=sHLogo>
<SPAN>
<IMG alt=安博教育 src="/vsts/images/ambow5.gif"></A>

</SPAN>
</DIV>


<DIV class=sHLinks>
<A href="http://finance.sina.com.cn/">财经首页</A>&nbsp;|&nbsp;
<A href="http://www.ambow.com/">安博首页</A>&nbsp;|&nbsp;
<A href="http://news.sina.com.cn/guide/">新浪导航</A>
</DIV>
</DIV>
</DIV>

<DIV id=level2headerborder></DIV>

 	<div style="width:950px;height:90px;margin:0 auto 5px;">
<iframe frameborder="0" scrolling="no" class="flashIFrameAds" src="/vsts/images/a2.gif" style="width:950px;height:90px;"></iframe>
	</div>




<div style="width:950px;height:20px;margin:0 auto 5px;">  <hr >  </div>
<DIV class=secondaryHeader style="MARGIN: 0px auto; WIDTH: 950px">
<DIV class=sHBorder>

<DIV class=sHLinks>
<a href="/vsts/index.jsp">我的首页</a>&nbsp;|&nbsp;
<a href="/vsts/manager/stock.do?method=showHolding">我的持仓</a>&nbsp;|&nbsp;
<a href="/vsts/manager/stock.do?method=showTrade">交易明细</a>&nbsp;|&nbsp;
<a href="/vsts/manager/stock.do?method=message">帐户信息</a>&nbsp;|&nbsp;
<a href="/vsts/register.jsp">注册用户</a>&nbsp;|&nbsp;
<a href="/vsts/login.jsp">重新登录</a>&nbsp;|&nbsp;
<a href="/vsts/login.jsp">安全退出</a>&nbsp;&nbsp;
</DIV>
</DIV>
</DIV>


	
	
<br>
<div style="width:950px;height:50px;margin:0 auto 5px;">
<hr >
</div>






<div style="width:950px;height:50px;margin:0 auto 5px;">
<table width="70%" border="1" cellpadding="0" bordercolorlight="#999999" bordercolordark="#FFFFFF" 
cellspacing="0" align="center">

	<tr align="center">
	     <td>序&nbsp;&nbsp;号</td>
		<td>股票代码</td>
		<td>股票名称</td>
		<td>股票价格</td>
		<td>股票数量</td>
		<td>交易类型</td>
		<td>交易时间</td>
	</tr>
	<c:forEach var="t" items="${trades}" varStatus="dd">
		<tr   onmousemove="color=this.style.backgroundColor;this.style.backgroundColor='rgb(225,225,225)'" style="width: 529px" onmouseout="this.style.backgroundColor='white'">
		<td  align="center">${dd.count}</td>        
        <td  align="center" ><c:out value="${t.stock.code}"/> </td>
        <td  align="center"><c:out value="${t.stock.name}"/></td>
        <td  align="center"><c:out value="${t.tradePrice}"/></td>
        <td  align="center"><c:out value="${t.tradeNumber}"/></td>
		<td  align="center"><c:out value="${t.type.info}"/></td>
		<td  align="center"><c:out value="${t.tradeDate}"/></td>
		</tr>
	</c:forEach>
</table>
</div>
	
<br>
<br>
<div style="width:950px;height:90px;margin:0 auto 5px;">
<hr >





     
<style type="text/css">
<!--
td,body { color:#152286; font-size:12px;}
-->
</style>

		
<DIV class=secondaryHeader style="MARGIN: 0px auto; WIDTH: 950px;height:120px;">		
<p align="center">  
<SPAN>
<IMG alt=安博教育 src="/vsts//images/index_logo.gif"></A>
</SPAN>
</p>
<div id="banquan">
<div class="banquan_01">
  <div align="center">安博职业教育：<a href="http://www.hopeschool.com.cn/" target="_blank">安博大连希望学校</a> | <a href="http://www.yinghaoedu.com/" target="_blank">安博上海英豪学校</a> | <a href="http://www.pc6000.com/index5.asp" target="_blank">安博天津长城学校</a> | <a href="http://www.ccxx.net/" target="_blank">安博北京亚威学校</a> | <a href="http://vocationaledu.ambow.com/sz/index.html" target="_blank">安博苏州实训基地<br />
<a href="declare.html" target="_blank">隐私声明</a> | <a href="banquan.html" target="_blank">版权声明</a><br />
   安博(昆山)服务外包产业园　地址：江苏省昆山市花桥镇安博路1号　联系电话：86-0512-55251188<br />
     <a href="http://www.miibeian.gov.cn/">京ICP备05050178号</a> </div>
  </div>
</div>
</DIV>
	
	
	
	