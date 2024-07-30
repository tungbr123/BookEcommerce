package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.RegisterService;
import Service.ServiceImpl.RegisterServiceImpl;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/register" })
public class RegisterController extends HttpServlet {
	RegisterService registerService = new RegisterServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		RequestDispatcher rq = req.getRequestDispatcher("views/register.jsp");
		rq.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String confirm_password = req.getParameter("password2");
		String alertMsg = "";
		if (registerService.checkExistEmail(email) == true) {
			alertMsg = "Email đã tồn tại!";
			req.setAttribute("mess1", "Đăng kí thất bại");
			req.setAttribute("mess", alertMsg);
			req.getRequestDispatcher("views/register.jsp").forward(req, resp);
			return;
		}
		if (registerService.checkExistPhone(phone) == true) {
			alertMsg = "Số điện thoại đã tồn tại!";
			req.setAttribute("mess1", "Đăng kí thất bại");
			req.setAttribute("mess", alertMsg);
			req.getRequestDispatcher("views/register.jsp").forward(req, resp);
			return;
		} 
		if (password.equals(confirm_password)) {
			registerService.register(firstname, lastname, email, phone, confirm_password);
			resp.sendRedirect("home");
		} else {
			req.setAttribute("mess1", "Đăng kí thất bại");
			req.setAttribute("mess", "Mật khẩu nhập lại không đúng");
			req.getRequestDispatcher("views/register.jsp").forward(req, resp);
		}
	}
}
