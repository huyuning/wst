package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author hyn
 * @create 2019-12-27-13:42
 */
@WebFilter(filterName = "CheckloginFilter")
public class CheckloginFilter implements Filter {
	public void destroy() {
	}
	
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		String path = request.getRequestURI();
		System.out.println("过滤器过滤了"+path);
		path = path.toLowerCase();
		if (path.indexOf("login.jsp")>=0 || path.endsWith(".js")||path.endsWith(".css")|| path.endsWith(".gif"	)|| path.endsWith(".jpg")|| path.endsWith(".js")||path.endsWith("user")){
			//用户已登陆，已放行
//			System.out.println("网页"+request.getRequestURI()+"经过滤器验证已登陆");
			chain.doFilter(req,resp);
		}else {
			HttpSession httpSession = request.getSession();
			String username = (String)httpSession.getAttribute("username");
			if(username==null||username.length()==0){
				response.sendRedirect("login.jsp");
				
			}else {
				chain.doFilter(req, resp);
			}
		}
		
		
	}
	
	public void init(FilterConfig config) throws ServletException {
		
	}
	
}
