package com.ambow.vsts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ambow.vsts.dao.TradeDao;
import com.ambow.vsts.dao.imp.TradeDaoHibernateImpl;
import com.ambow.vsts.entity.Stock;
import com.ambow.vsts.entity.Trade;
import com.ambow.vsts.entity.TradeType;
import com.ambow.vsts.entity.User;

public class StockDoServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		User user = (User)request.getSession().getAttribute("u");
		//1、获得用户提交的数据
		int stock_id = Integer.parseInt(request.getParameter("stock_id"));
		double price = Double.parseDouble(request.getParameter("price"));
		int num = Integer.parseInt(request.getParameter("num"));
		//String userName = request.getParameter("user.name");
		//2、组装Trade对象
		Trade t = new Trade();
		t.setStock( new Stock(stock_id));
		t.setTradeDate(new java.util.Date());
		t.setTradeNumber(num);
		t.setTradePrice(price);
		t.setTradetype(new TradeType(1,"买入"));
		t.setUser(user);
	
		//调用服务层代码完成业务逻辑
		TradeDao tradeDao = new TradeDaoHibernateImpl();
		try {
			tradeDao.addTrade(t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("SaleOrBuyServlet").
			forward(request,response);
//		System.out.println("ok");
//		//转向合适的页面
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out
//				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
//		out.println("<HTML>");
//		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
//		out.println("  <BODY>");
//		out.print("    This is ");
//		out.print(this.getClass());
//		out.println(", using the POST method");
//		out.println("  </BODY>");
//		out.println("</HTML>");
//		out.flush();
//		out.close();
	}

}
