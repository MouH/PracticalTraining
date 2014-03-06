<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>超级霸王花</title>
<meta name="keywords" content="Business Template, xhtml css, free web design template" />
<meta name="description" content="sc.chinaz.com provided by templatemo.com" />
<link href="css/index.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript">
function clearText(field){

    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;

}
</script>
</head>
<body>
<div id="templatemo_container">
	
    <div id="templatemo_banner">
    <marquee style="WIDTH: 388px; HEIGHT: 120px" scrollamount="5" direction="left" >
				<div align="left" ><br />
				</div>
				 <div id="logo"></div>
				<br />
		</marquee >
    </div>
    
    <div id="templatemo_menu_search">
        <div id="templatemo_menu">
            <ul>
                <li><a href="index.jsp" class="current">首页</a></li>
                <li><a href="SaleOrBuyServlet">股票交易</a></li>
                <li><a href="TradeDetailServlet">交易明细</a></li>
                <li><a href="AccountServlet">账户信息</a></li>
                <li><a href="register.jsp" >注册用户</a></li>
				<li><a href="ReLoginServlet" class="last">重新登录</a></li>
            </ul>    	
        </div> <!-- end of menu -->
        

        
        <div class="cleaner"></div>	
	</div>
    
    <div id="templatemo_content">
    
    	<div class="section_w650 fl">
		<div>
	<style type="text/css"> 
      #album{ 
        position:relative; 
        width:600px; 
        height:300px; 
        border:10px solid #EFEFDA; 
        overflow:hidden; 
      } 
      #album dt { 
        margin:0; 
        padding:0; 
        width:400px; 
        height:300px; 
        overflow:hidden; 
      } 
      #album img { 
        border:2px solid #000; 
      } 
      #album dd { 
        position:absolute; 
        right:0px; 
        bottom:10px; 
      } 
      #album a { 
        display:block; 
        float:left; 
        margin-right:10px; 
        width:20px; 
        height:20px; 
        line-height:20px; 
        text-align:center; 
        text-decoration:none; 
        color:#808080; 
        background:transparent url(images/bo.png) no-repeat -15px 0; 
      } 
      #album a:hover ,#album a.hover{ 
        color:#F8F8F8; 
        background-position:0 0; 
      } 
    </style> 
     
    <dl id="album"> 
      <dt> 
        <img id="index1"  src="images/image3.png" /> 
        <img id="index2" src="images/image2.png" /> 
        <img id="index3"src="images/image1.png" /> 

      </dt> 
      <dd> 
        <a href="#index1">1</a><a href="#index2">2</a><a href="#index3">3</a> 
      </dd> 
    </dl> 
    <script type="text/javascript"> 
      function imageRotater(id){ 
        var cases = "", 
        album = document.getElementById(id), 
        images = album.getElementsByTagName("img"), 
        links = album.getElementsByTagName("a"), 
        dt = album.getElementsByTagName("dt")[0], 
        length = images.length, 
        aIndex = 1, 
        aBefore = length; 
        for(var i=0;i< length;i++){ 
          cases += images[i].id + ':"'+images[i].getAttribute("src")+'",' 
        } 
        images[0].style.cssText = "position:absolute;top:0;left:0;";//修正图片位置错误 
        var tip = document.createElement("dd"); 
       // tip.style.cssText = "position:absolute;bottom:0;height:20px;width:380px;padding:10px;color:#fff;background:#fff;"; 
        album.insertBefore(tip,dt.nextSibling); 
        if(!+"\v1"){ 
          tip.style.color = "#369"; 
          tip.style.filter = "alpha(opacity=67)" 
        }else{ 
          tip.style.cssText += "background: rgba(164, 173, 183, .65);" 
        } 
        cases = eval("({"+cases.replace(/,$/,"")+"})"); 
        for(var i=0;i<length;i++){ 
          links[i].onclick = function(e){ 
            e =e || window.event; 
            var index = this.toString().split("#")[1]; 
            aIndex = index.charAt(index.length-1);//☆☆☆☆ 
            images[0].src = cases[index]; 
            tip.innerHTML = images[aIndex -1].getAttribute("alt"); 
              !+"\v1" ?(e.returnValue = false) :(e.preventDefault()); 
          } 
        } 
        var prefix = images[0].id.substr(0,images[0].id.length -1); 
        (function(){ 
          setTimeout(function(){ 
            if(aIndex > length){ 
              aIndex = 1; 
            } 
            images[0].src = cases[prefix+aIndex]; 
            tip.innerHTML = images[aIndex -1].getAttribute("alt"); 
            tip.style.bottom = "-40px"; 
            links[aBefore-1].className = ""; 
            links[aIndex-1].className = "hover"; 
            aBefore = aIndex; 
            aIndex++; 
            move(tip); 
            setTimeout(arguments.callee,1500) 
          },1500) 
        })() 
        var move = function(el){ 
          var begin = parseFloat(el.style.bottom), 
          speed = 1; 
          el.bottom = begin; 
          (function(){ 
            setTimeout(function(){ 
              el.style.bottom = el.bottom + speed + "px"; 
              el.bottom += speed; 
              speed *= 1.5;//下一次移动的距离 
              if(el.bottom >= 0){ 
                el.style.bottom = "0px"; 
              }else{ 
                setTimeout(arguments.callee,23); 
              } 
            },25) 
          })() 
        } 
      } 
      window.onload = function(){ 
        try{document.execCommand("BackgroundImageCache", false, true);}catch(e){}; 
        imageRotater("album"); 
      } 
    </script> 
	</div>
	
	
	<div class="margin_bottom_30 border_bottom"></div>
            <div class="margin_bottom_30"></div>
           
            <div class="section_w200 fl margin_right_25">
            	
              
                
              <div class="header_02">新手上路 </div>
			<ul>
            <li><a href="http://www.baidu.com"><font color="black">新手入门须知，适合初学者股票入门知识</font></a></li>
            <li><a href="http://www.baidu.com"><font color="black">主力机构惯用的十大兵法和应对术</font></a></li>
            <li><a href="http://www.baidu.com"><font color="black">欧阳东华：耐心比技巧更重要</font></a></li>
            <li><a href="http://www.baidu.com"><font color="black">控制资产比例，应对股市波动</font></a></li>
            <li><a href="http://www.baidu.com"><font color="black">从成交细节看大单性质</font></a></li>
            </ul>
      
                <div class="margin_bottom_10"></div>
                <div class="rc_btn_01"><a href="http://www.baidu.com"></a></div>
            
            </div>
         


            <div class="section_w200 fl margin_right_25">
            	
                <div class="header_02">实战技巧</div>
			<ul>
            <li><a href="http://www.baidu.com"><font color="black">预期收益中的假设是重点</font></a></li>
            <li><a href="http://www.baidu.com"><font color="black">如何才能买对股？不买最好，只买最值</font></a></li>
            <li><a href="http://www.baidu.com"><font color="black">股神巴菲特的百条炒股细则</font></a></li>
            <li><a href="http://www.baidu.com"><font color="black">投资者警惕追买连续涨停股票风险</font></a></li>
            <li><a href="http://www.baidu.com"><font color="black">60分钟短线波段战术</font></a></li>
            </ul>
      
                <div class="margin_bottom_10"></div>
                <div class="rc_btn_01"><a href="http://www.baidu.com"></a></div>
            </div>
            <div class="section_w200 fl">
            	
               <div class="header_02">经验交流</div>
			<div>
		
			<ul>
            <li><a href="http://www.baidu.com"><font color="black">一个“知天命”的新手的炒新苦旋</font></a></li>
            <li><a href="http://www.baidu.com"><font color="black">彼得林奇的投资法则之四：跟着嘴投资</font></a></li>
            <li><a href="http://www.baidu.com"><font color="black">一个基民的投资总结报告：四个教训+七点经验</font></a></li>
            <li><a href="http://www.baidu.com"><font color="black">罗杰斯的七条投资法则</font></a></li>
            </ul>
			</div>
      
                <div class="margin_bottom_10"></div>
                <div class="rc_btn_01"><a href="http://www.baidu.com"></a></div>
            </div>
           
			<div class="cleaner"></div>
			
			
			
			
            <div class="margin_bottom_30 border_bottom"></div>
            <div class="margin_bottom_30"></div>
            
            <div id="news_events_title"></div>
            <div class="section_w200 fl margin_right_25">
            	
                <div class="image_wrapper_01">
                	<a href="http://finance.sina.com.cn/money/future/oil/20120707/091612505085.shtml"><img src="images/2.png" alt="image" /></a>                </div>
                
              <div class="header_02">纽约原油期货收盘下跌3.2% </div>
                <p>新浪财经讯 北京时间7月7日凌晨消息，纽约原油(84.12,-3.10,-3.55%)期货价格</p>
                <div class="margin_bottom_10"></div>
                <div class="rc_btn_01"><a href="http://finance.sina.com.cn/money/future/oil/20120707/091612505085.shtml"></a></div>
            
            </div>
         


            <div class="section_w200 fl margin_right_25">
            	
                <div class="image_wrapper_01">
                	<a href="http://finance.sina.com.cn/stock/marketresearch/20120707/092112505098.shtml"><img src="images/3.png" alt="image" /></a>                </div>
                
              <div class="header_02">三大市场化改革决定A股未来走向</div>
                <p>不到一个月的时间，央行两次降息，并且都释放出利率</p>
                <div class="margin_bottom_10"></div>
                <div class="rc_btn_01"><a href="http://finance.sina.com.cn/stock/marketresearch/20120707/092112505098.shtml"></a></div>
            
            </div>
            
            <div class="section_w200 fl">
            	
                <div class="image_wrapper_01">
                	<a href="http://finance.sina.com.cn/stock/t/20120707/025412502814.shtml"><img src="images/1.png" alt="image" /></a>                </div>
                
              <div class="header_02">二次降息或助反弹</div>
                <p>对于央行周四晚间宣布年内二次降息，市场几乎是一边倒的看空声音</p>
                <div class="margin_bottom_10"></div>
                <div class="rc_btn_01"><a href="http://finance.sina.com.cn/stock/t/20120707/025412502814.shtml"></a></div>
            
            </div>
           
			<div class="cleaner"></div>
        </div> <!-- end of section 650 left column -->
        
        <div class="section_w270 fr">
        	

            <br>
		     <div class="margin_bottom_30 border_bottom"></div>
			 <div class="margin_bottom_30"></div>
			<div id="welcome_p">
        	<p>霸王花股票交易系统由中国霸王花集团开发完成</p>
			<p>想轻松实现股票交易吗？</p>
			<p>霸王花就是您的选择！</p>
		    </div>
			  <br>
            <div id="news_events_section_wrapper">
			   
				<div id="login_input">
					<div id="inputHead">
						<div>
							<span id="user_login">请登录</span>
						</div>
					</div>
					<div id="inputBody" style="height:100px;width:225px;">
						<div id="msg">
						</div>
						<ul id="nameAndPwd">

							<form method="post" action="LoginServlet">
								用户名 <input name="name" value="" type="text" class="loginInput"><br>
								密　码 <input name="passwd" value="" type="password" class="loginInput">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="登 录"> &nbsp;&nbsp;&nbsp;<input type="reset" value="取 消">
							</form>
						</ul>			
					</div>
				</div>
				
	        </div>
            
            <div class="margin_bottom_30 border_bottom"></div>
            <div class="margin_bottom_30"></div>
             <div>
					<h2><font face="幼圆">友情链接</font></h2>	
					<a href="http://finance.sina.com.cn/"><img style="border:0;width:88px;height:31px" src="images/sina.png" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>
					<br>
				    <a href="http://jigsaw.w3.org/css-validator/check/referer"><img style="border:0;width:88px;height:31px"  src="images/feng.jpg" alt="Valid CSS!" vspace="8" border="0" /></a> 
					<br>
					<a href="http://www.ambow.com/"><img style="border:0;width:88px;height:31px"  src="images/ambow.gif" alt="Valid CSS!" vspace="8" border="0" /></a> 
					  	<br>	<br>
				
			  
		  </div>
            <div id="contact_title"></div>
			<div>
				<span >联系方式</span>
			</div>
			 
            <ul class="contact_info_list" >
            	<li><span>电话</span> 		10086</li>

				<li><span>Email:</span> 		info @ templatemo . com</li>
				<li><span>Website:</span> 	<a href="http://www.swufe.edu.cn" target="_parent">www.swufe.edu.cn</a></li>
            </ul>
           
		<!--	<div>
			<h2>友情提示：股市有风险，请谨慎交易!</p>
			</div>-->
          
        </div> <!-- end of section 270  rigth column -->
        
		<div class="cleaner"></div>    
    </div>
    
    <div id="templatemo_footer">
  
        <div class="margin_bottom_10"></div>      
    	 版权所有 2012  <a href="#">西南财经大学</a>  霸王花项目小组 <a href="http://www.swufe.edu.cn/" target="_parent"></a>    </div> 
    <!-- end of footer -->
<!--  Free Website Templates @ TemplateMo.com  -->
</div>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div></body>
</html>