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
@WebServlet(name= "newpassword", urlPatterns = {"/newpassword"})

public class NewPasswordController extends HttpServlet{
	LoginService loginService= new LoginServiceImpl();
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");		
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		RequestDispatcher rq= req.getRequestDispatcher("decorators/new_password.jsp");
		rq.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pass= req.getParameter("password");
		String pass2= req.getParameter("password2");
		HttpSession session= req.getSession();
		String email= session.getAttribute("email").toString();

		if(pass.equals(pass2))
		{
			loginService.updatePass(email, pass);
			resp.sendRedirect("login");
		}
		else
		{
			req.setAttribute("mess", "Xac nhan mat khau moi khong dung");
			req.getRequestDispatcher("/decorators/new_password.jsp").forward(req, resp);
		}
	}
}
