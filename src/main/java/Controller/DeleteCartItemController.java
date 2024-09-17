package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.CartItemService;
import Service.ServiceImpl.CartItemServiceImpl;

@WebServlet(urlPatterns = {"/delete"})
public class DeleteCartItemController extends HttpServlet{
	CartItemService cartItem= new CartItemServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String _id = req.getParameter("id");
		
		int id= Integer.parseInt(_id);
		
		cartItem.deleteCartItemById(id);
		
		HttpSession session= req.getSession();
		session.setAttribute("sign", "delete");
		
		resp.sendRedirect("cart");
		
	}
}
