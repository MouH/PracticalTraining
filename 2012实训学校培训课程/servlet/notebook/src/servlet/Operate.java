package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.*;
import bean.*;
import java.sql.ResultSet;
import java.util.*;


public class Operate extends HttpServlet {
	DBOperate dbop;
	/**
	 * Constructor of the object.
	 */
	public Operate() {
		super();
		dbop=DBOperate.getInstance();
		dbop.buildConnection("d:/");
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

		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		Object obj=request.getParameter("optype");
		Object obj2;
		int optype;
		int uid;	// 每条留言的编号
		String sql;
		String contents,author;
		
		if (obj==null)
			optype=1;
		else
			optype=Integer.parseInt(obj.toString());
		
		// optype=1 显示留言簿信息 2=删除信息 3=插入信息
//		System.out.println(optype);
		if(optype==2){
			obj=request.getParameter("uid");
			if(obj==null)
				go(request,response);
			uid=Integer.parseInt(obj.toString());
			sql="delete from book where id="+uid;
			dbop.operate(sql);
		}else if(optype==3){
			obj=request.getParameter("uname");
			obj2=request.getParameter("ucontent");
			if(obj!=null&&obj2!=null){
				sql="insert into book (uname,ucontent) values('"+obj.toString()+"','"+obj2.toString()+"')";
//				System.out.println(sql);
				dbop.operate(sql);
			}
		}
		go(request,response);
	}
	private void go(HttpServletRequest request, HttpServletResponse response){
		String sql="select uname,ucontent,id from book";
		String uname,ucontent;
		int uid;
		ArrayList<Record> list=new ArrayList<Record>();
		RequestDispatcher red=request.getRequestDispatcher("index.jsp");
		try{
			ResultSet rs=dbop.select(sql);
			while(rs.next()){
				uname=rs.getString(1);
				ucontent=rs.getString(2);
				uid=rs.getInt(3);
				list.add(new Record(uname,ucontent,uid));
			}
			request.setAttribute("list", list);
			red.forward(request, response);

		}catch(Exception e){
			e.printStackTrace();
		}
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
