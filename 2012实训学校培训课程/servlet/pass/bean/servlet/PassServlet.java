package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;



public class PassServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public PassServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		RequestDispatcher requestDispatcher=request.getRequestDispatcher("../showinfo2.jsp");
		RequestDispatcher forw=request.getRequestDispatcher("../showinformation.jsp");
		RequestDispatcher back=request.getRequestDispatcher("../form2.jsp");
		
		String age=request.getParameter("age");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		if(age==null||name==null||sex==null||age.length()==0||name.length()==0||sex.length()==0){
			response.sendRedirect("../form2.jsp");
			return;
		}
		UserInfo ui=new UserInfo();
		ui.setAge(age);
		ui.setName(name);
		ui.setSex(sex);
		request.setAttribute("user", ui);
		forw.forward(request,response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
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
