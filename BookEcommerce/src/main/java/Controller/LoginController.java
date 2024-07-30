package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Models.UserModel;
import Service.LoginService;
import Service.ServiceImpl.LoginServiceImpl;



@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/login"})
public class LoginController extends HttpServlet{
	LoginService loginService= new LoginServiceImpl();
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		req.getRequestDispatcher("/decorators/login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email= req.getParameter("email");
		String password= req.getParameter("password");
		
		UserModel account= loginService.login(email,password);
		

		if(account == null)
		{
			req.setAttribute("mess", "Sai tài khoản hoặc mật khẩu");
			req.getRequestDispatcher("/decorators/login.jsp").forward(req, resp);
		}else
		{
			HttpSession session= req.getSession();
			session.setAttribute("acc", account);		
			session.setMaxInactiveInterval(1000);
			resp.sendRedirect("home");
			
		}
	}
}
