package com.ambow.vsts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ambow.vsts.dao.TradeDao;
import com.ambow.vsts.dao.imp.TradeDaoHibernateImpl;
import com.ambow.vsts.entity.User;

public class TradeDetailServlet extends HttpServlet {

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
		
		
		//获得用户ID,从Session中获取

		User user = (User)request.getSession().getAttribute("u");
		if(user==null){
			response.sendRedirect("index.jsp");
		}else{
			int userID = user.id;
			//获得该用户的交易明细
			TradeDao tradeDao = 
				new TradeDaoHibernateImpl();
			Collection trades = null;
			try {
				trades = tradeDao.findAll(userID);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//将这个集合放在request作用域中
			request.setAttribute("trades", trades);
//			System.out.println(trades.size());
			request.setAttribute("flag",trades.size()==0);
			
			//转向显示页面
			request.getRequestDispatcher("trade.detail.jsp").
				forward(request,response);
		}
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
