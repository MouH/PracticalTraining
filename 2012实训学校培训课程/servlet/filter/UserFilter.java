import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class UserFilter extends HttpServlet implements Filter{
	private FilterConfig filterConfig;
	public void init(FilterConfig filterConfig)throws ServletException{
		this.filterConfig=filterConfig;
	}
	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain filterChain)throws ServletException,IOException{
		HttpSession session =((HttpServletRequest)request).getSession();
		response.setCharacterEncoding("GBK");
		if(session.getAttribute("user")==null){
			((HttpServletResponse)response).sendRedirect("index.jsp");
		}else
			filterChain.doFilter(request,response);
	}
	public void destroy(){
		
	}
}
