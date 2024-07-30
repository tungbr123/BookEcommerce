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
@WebServlet(urlPatterns = {"/editprofile"})
public class EditProfileController extends HttpServlet{
	LoginService login= new LoginServiceImpl();
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");		
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		HttpSession session= req.getSession();
		UserModel user= (UserModel)session.getAttribute("acc");
		
		String phone= req.getParameter("phone");
		if(phone==null)
			phone=user.get_phone();

		String firstname= req.getParameter("firstname");
		if(firstname==null)
			firstname=user.get_firstname();
		String lastname= req.getParameter("lastname");
		if(lastname==null)
			lastname=user.get_lastname();
		String email= req.getParameter("email");
		if(email==null)
			email=user.get_email();
		user.set_firstname(firstname);
		user.set_lastname(lastname);
		user.set_email(email);
		String currentPass= req.getParameter("password");
		if(currentPass==null)
			currentPass=user.get_hashed_password();
		String newPass= req.getParameter("newpassword");
		if(newPass==null)
			newPass=user.get_hashed_password();
		String confirmPass= req.getParameter("confirmpassword");
		if(confirmPass==null)
			confirmPass="confirm";
		
		if(currentPass.equals(user.get_hashed_password()))
			if(newPass.equals(confirmPass))
			{
				user.set_hashed_password(newPass);
				
			}
			else
			{
				req.setAttribute("mess", "Mật khẩu nhập lại không đúng");
			}
		else
		{
			req.setAttribute("mess", "Mật khẩu hiện tại không đúng");
		}
		user.set_hashed_password(newPass);
		login.updateProfile(user);
		session.setAttribute("acc", user);
		resp.sendRedirect("profile");
	}
	
	public static void main(String[] args) {
		LoginService login= new LoginServiceImpl();
		UserModel user=  new UserModel();
		user.set_firstname("Tung");
		user.set_lastname("Lai Khanh");
		user.set_email("tungvippro456@gmail.com");
		user.set_hashed_password("123");
		user.setId(2);
		login.updateProfile(user);
	}
}
