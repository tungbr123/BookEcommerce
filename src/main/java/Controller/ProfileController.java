package Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import Models.UserModel;
import Service.LoginService;
import Service.ServiceImpl.LoginServiceImpl;

@SuppressWarnings("serial")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
		maxFileSize = 1024 * 1024 * 10, // 10MB
		maxRequestSize = 1024 * 1024 * 50)
@WebServlet(urlPatterns = { "/profile" })
public class ProfileController extends HttpServlet {
	LoginService login = new LoginServiceImpl();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		req.getRequestDispatcher("decorators/profile.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession session = req.getSession();
		UserModel user = (UserModel) session.getAttribute("acc");

		String phone = req.getParameter("phone");
		if (phone == null || phone == "")
			phone = user.get_phone();

		String firstname = req.getParameter("firstname");
		if (firstname == null || firstname == "")
			firstname = user.get_firstname();

		String lastname = req.getParameter("lastname");
		if (lastname == null || lastname == "")
			lastname = user.get_lastname();

		String address = req.getParameter("address");
		if (address == null || address == "")
			address = user.get_addresses();

		String email = req.getParameter("email");
		if (email == null || email == "")
			email = user.get_email();

		user.set_firstname(firstname);
		user.set_lastname(lastname);
		user.set_email(email);
		user.set_phone(phone);
		user.set_addresses(address);

		String currentPass = req.getParameter("password");
		if (currentPass == null)
			currentPass = user.get_hashed_password();

		String newPass = req.getParameter("newpassword");
		if (newPass == null || newPass == "")
			newPass = user.get_hashed_password();

		String confirmPass = req.getParameter("confirmpassword");
		if (confirmPass == null)
			confirmPass = "confirm";

		if (currentPass.equals(user.get_hashed_password()))
			if (newPass.equals(confirmPass)) {
				user.set_hashed_password(newPass);
			} else {
				req.setAttribute("mess", "Mật khẩu nhập lại không đúng");
			}
		else {
			req.setAttribute("mess", "Mật khẩu hiện tại không đúng");
		}
		user.set_hashed_password(newPass);

		try {
			Part part = req.getPart("photo");
			String realPath = req.getServletContext().getRealPath("images");
			String fileName = Paths.get(part.getSubmittedFileName()).getFileName().toString();

			if (!Files.exists(Paths.get(realPath))) {
				Files.createDirectory(Paths.get(realPath));
			}
			part.write(realPath + "/" + fileName);
			user.set_avatar("images/" + fileName);
		} catch (Exception e) {
			// TODO: handle exception
		}
		login.updateProfile(user);
		session.setAttribute("acc", user);

		req.getRequestDispatcher("decorators/profile.jsp").forward(req, resp);

	}

	public static void main(String[] args) {
		LoginService login = new LoginServiceImpl();
		UserModel user = new UserModel();
		user.set_firstname("Tùng");
		user.set_lastname("Lai Khánh");
		user.set_email("tungvippro456@gmail.com");
		user.set_hashed_password("123");
		user.set_phone("0582481045");
		user.set_addresses("36/21/đường số 6/ phường linh chiểu/TP.Thủ Đức");
		user.set_avatar("images/318233245_690796972428454_5214172061071526534_n.jpg");
		user.setId(2);
		login.updateProfile(user);
	}
}
