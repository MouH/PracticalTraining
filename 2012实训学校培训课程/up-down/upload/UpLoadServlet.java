package servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qjt.UpLoadFile;

public class UpLoadServlet extends HttpServlet {
	public UpLoadServlet() {
		super();
	}
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		ServletInputStream in=request.getInputStream();
		UpLoadFile up=new UpLoadFile();
		String sta="suc";
		try{
			up.save(request);
		}catch(Exception e){
			e.printStackTrace();
			sta="fail";
		}
		request.setAttribute("upfile", sta);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("../upload.jsp");
		requestDispatcher.forward(request, response);
	}
		
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
}
