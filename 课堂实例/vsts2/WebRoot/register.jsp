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



<script language="javascript">
	<!--
	function getElementByName(name)
	{
	    var elements = document.getElementsByName(name);
	    return elements[0];
	}
    function validate()
    {
        var element = getElementByName("user.name");
        if(element.value.length == 0)
        {
            alert("请输入用户姓名！");
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
-->
</script>

 <link rel="stylesheet" media="all" type="text/css" href="css/login.css" />
 <div style="width:950px;height:90px;margin:0 auto 5px;">
<form  onsubmit="return validate()"  method="post"   action="RegisterServlet"  >
<table border="1" align="center" width="80%"  >

<tr>
<td align="left" width="150" >用户姓名<font color="red">*</font></td>
<td width="250"  > <input type="text"  name="name" size="25" /> </td>
<td aling="center" width="300" ><font color="red">  请输入用户的登陆名称（只限字母，数字，特殊符号） </font></td>
</tr>
<tr>
<tr>
<td align="left" width="150" >登陆密码<font color="red">*</font></td>
<td width="250"  > <input type="password"  name="passwd" size="25" /> </td>
<td aling="center" width="300" ><font color="red">   请输入用户的登陆密码（只限字母，数字，特殊符号）</font></td>
</tr>
<tr>
<td align="left" width="150" >重复密码<font color="red">*</font></td>
<td width="250"  > <input type="password"  name="user.passwd2" size="25" /> </td>
<td aling="center" width="300"  > <font color="red">  请重复输入以上密码</font></td>
</tr>
<tr>
<td align="leftr" width="150" >邮&nbsp;&nbsp;&nbsp;&nbsp;箱<font color="red">*</font></td>
<td width="250"  > <input type="text"  name="email" size="25" /> </td>
<td aling="center" width="300"  > <font color="red">   请输入邮箱信息</font></td>
</tr>

<tr>
<td align="left" width="150" >联系电话</td>
<td width="250"  > <input type="text"  name="phone" size="25" /> </td>
<td aling="center" width="300"  >  <font color="red">  请输入联系电话</font></td>
</tr>

<tr>
<td align="left" width="150" >联系住址</td>
<td width="250"  > <input type="text"  name="address" size="25" /> </td>
<td aling="center" width="300"  > <font color="red">   请输入联系住址</font></td>
</tr>

</table>


<p align="center">
<input type="submit" value="确 定"    />
&nbsp;&nbsp;&nbsp;
<input type="button" value=" 取 消"   />
</p>

</form>
</div>



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
</div>

