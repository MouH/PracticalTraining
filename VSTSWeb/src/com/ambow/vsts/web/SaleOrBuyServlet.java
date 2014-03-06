package com.ambow.vsts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ambow.vsts.dao.HoldingDao;
import com.ambow.vsts.dao.TradeDao;
import com.ambow.vsts.dao.imp.HoldingDaoHibernateImpl;
import com.ambow.vsts.dao.imp.StockDaoHibernateImpl;
import com.ambow.vsts.dao.imp.TradeDaoHibernateImpl;
import com.ambow.vsts.entity.Stock;
import com.ambow.vsts.entity.User;

public class SaleOrBuyServlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

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
		Collection stock = null;
		if(user==null){
			response.sendRedirect("index.jsp");
		}else{
			int userID = user.id;
			//获得该用户的交易明细
			HoldingDao holdingDao = new HoldingDaoHibernateImpl();
			Collection holding = null;
			try {
				holding = holdingDao.findAll(userID);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//将这个集合放在request作用域中
			request.setAttribute("holding", holding);
			System.out.println(holding.size());
			request.setAttribute("flag",holding.size()==0);
			try {
				stock = new StockDaoHibernateImpl().findAll();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("stock", stock);
			
			//转向显示页面
			request.getRequestDispatcher("stock.do.jsp").
				forward(request,response);
		}
		
//		User user = (User)request.getSession().getAttribute("u");
//		if(user==null){
//			response.sendRedirect("index.jsp");
//		}
//		else{
//			HoldingDao holdingDao = new HoldingDaoHibernateImpl();
//			Collection holding = holdingDao.findAll(user.id);
//			request.setAttribute("holding", holding);
//			request.getRequestDispatcher("stock.do.jsp").forward(request,response);
//		}
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
