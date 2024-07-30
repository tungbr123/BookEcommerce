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
@WebServlet(name="forgetpassword",urlPatterns = {"/forgetpassword"})
public class ForgetPasswordController extends HttpServlet{
	LoginService loginService= new LoginServiceImpl();
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");		
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		RequestDispatcher rq= req.getRequestDispatcher("/decorators/forget_password.jsp");
		rq.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email= req.getParameter("email");
		UserModel account= loginService.loginEmail(email);
		
		if(account == null)
		{
			req.setAttribute("mess", "Email không tồn tại");
			req.getRequestDispatcher("/decorators/forget_password.jsp").forward(req, resp);
		}else
		{
			HttpSession session= req.getSession();
			session.setAttribute("email", email);
			resp.sendRedirect("newpassword");

		}
	}
}
