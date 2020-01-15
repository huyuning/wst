package servlet;

import service.UserService;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author hyn
 * @create 2019-12-26-14:47
 */
@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService service = new UserServiceImpl();
		String type = request.getParameter("type");
		switch (type){
			case "login":
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				int ret = service.login(username,password);
				if(ret==0){
					HttpSession httpSession = request.getSession();
					httpSession.setAttribute("username",username);
					response.sendRedirect("index.jsp");//登陆成功
				}else if (ret==-1){
					request.setAttribute("msg","用户名不存在");
					request.getRequestDispatcher("login.jsp").forward(request,response);
					System.out.println("  用户名不存在 ");
				}else if (ret==-2){
					request.setAttribute("msg","密码错误");
					request.getRequestDispatcher("login.jsp").forward(request,response);
					System.out.println("密码错误");
				}
				break;
			default:
				break;
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request,response);
	}
}
