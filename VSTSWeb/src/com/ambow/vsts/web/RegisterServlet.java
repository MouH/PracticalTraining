package com.ambow.vsts.web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ambow.vsts.dao.UserDao;
import com.ambow.vsts.dao.imp.UserDaoHibernateImpl;
import com.ambow.vsts.entity.User;

public class RegisterServlet extends HttpServlet {

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
		
		//1、获得用户提交的数据
		String name = request.getParameter("user.name");
		String passwd = request.getParameter("user.passwd");
		String phone = request.getParameter("user.phone");
		String email = request.getParameter("user.email");

		//2、组装User对象
		User u = new User();
		u.setName(name);
		u.setPasswd(passwd);
		u.setEmail(email);
		u.setPhone(phone);
		u.setReg_date(new java.util.Date());
		
		//调用服务层代码完成业务逻辑
		UserDao userDao = new UserDaoHibernateImpl();
		try {
			userDao.addUser(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("ok");
		//转向合适的页面
		response.sendRedirect("index.jsp");
//		request.getRequestDispatcher("index.jsp").forward(request,response);
		
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
