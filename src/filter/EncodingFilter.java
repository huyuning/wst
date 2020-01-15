package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author hyn
 * @create 2019-12-26-09:54
 */
@WebFilter(filterName = "EncodingFilter")
public class EncodingFilter implements javax.servlet.Filter {
	public void destroy() {
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/html;charset=utf-8");
		chain.doFilter(request, response);
	}
	
	public void init(FilterConfig config) throws ServletException {
		
	}
	
}
