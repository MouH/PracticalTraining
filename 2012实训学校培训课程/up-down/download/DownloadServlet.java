package servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import qjt.UpLoadFile;

public class DownloadServlet extends HttpServlet {
	public DownloadServlet() {
		super();
	}
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String filename=request.getParameter("file");
		String dir="d:/";
		String f;
		if(filename==null){
			request.setAttribute("sta", "fail");
			response.sendRedirect("download.jsp");
		}
		f=dir+filename;
		response.setHeader("Content-Disposition", "attachment; filename=" + filename); 
		OutputStream outputStream = response.getOutputStream();
		InputStream inputStream = new FileInputStream(f);
		byte[] buffer = new byte[1024];
		int i = -1;
		while ((i = inputStream.read(buffer)) != -1) {
			outputStream.write(buffer, 0, i);
		}
		outputStream.flush();
		outputStream.close();
		inputStream.close();
		outputStream = null;
	}
		
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
}
