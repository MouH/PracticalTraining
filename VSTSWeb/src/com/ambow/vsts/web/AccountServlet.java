package com.ambow.vsts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ambow.vsts.dao.HoldingDao;
import com.ambow.vsts.dao.UserDao;
import com.ambow.vsts.dao.imp.HoldingDaoHibernateImpl;
import com.ambow.vsts.dao.imp.UserDaoHibernateImpl;
import com.ambow.vsts.entity.User;

public class AccountServlet extends HttpServlet {

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
		if(user==null){
			response.sendRedirect("index.jsp");
		}
		else{
			request.getRequestDispatcher("account.jsp").forward(request,response);
		}
//		User u = new User(); 
//		u.setId(4);
//		u.setEmail("spp");
//		u.setName("spp");
//		u.setPasswd("spp");
//		u.setPhone("spp");
//		u.setReg_date(new java.util.Date());
//		request.getSession().setAttribute("u", u);
//		request.getRequestDispatcher("account.jsp").forward(request,response);
		
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
