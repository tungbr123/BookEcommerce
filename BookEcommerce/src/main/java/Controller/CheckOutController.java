package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Models.CartItemModel;
import Models.CartModel;
import Models.OrderItemModel;
import Models.OrderModel;
import Models.UserModel;
import Service.CartItemService;
import Service.CartService;
import Service.OrderService;
import Service.StoreService;
import Service.ServiceImpl.CartItemServiceImpl;
import Service.ServiceImpl.CartServiceImpl;
import Service.ServiceImpl.OrderServiceImpl;
import Service.ServiceImpl.StoreServiceImpl;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/checkout" })
public class CheckOutController extends HttpServlet {
	StoreService storeService = new StoreServiceImpl();
	CartItemService cartItemService = new CartItemServiceImpl();
	CartService cartService = new CartServiceImpl();
	OrderService orderService = new OrderServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession session = req.getSession();
		UserModel user = (UserModel) session.getAttribute("acc");
		List<CartItemModel> list = cartItemService.getCartItemByUserIdFromCart(user.getId());
		int total = 0;
		for (CartItemModel p : list) {
			total = total + (p.get_count() * p.get_productId().get_promotionalPrice());
		}
		req.setAttribute("total", total);
		req.setAttribute("ListCartItem", list);

		

		RequestDispatcher rq = req.getRequestDispatcher("views/check_out.jsp");
		rq.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		HttpSession session = req.getSession();
		UserModel user = (UserModel) session.getAttribute("acc");
		
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		String mess= "Your order is successfully converted to waiting state, thank you for trusting us!";
		
		OrderModel order = new OrderModel();
		order.set_userId(user);
		order.set_storeId(storeService.getStoreById(1));
		order.set_phone(phone);
		order.set_address(address);
		order.set_status("waiting");
		orderService.addToOrder(order);
		List<CartItemModel> list = cartItemService.getCartItemByUserIdFromCart(user.getId());

		OrderModel order1 = orderService.getLastOrder();

		OrderItemModel orderItem = new OrderItemModel();
		for (CartItemModel p : list) {
			orderItem.set_orderId(order);
			orderItem.set_productId(p.get_productId());
			orderItem.setCount(p.get_count());
			orderService.addToOrderItem(orderItem, order1.getId());
		}
		req.setAttribute("mess",mess);

		RequestDispatcher rq = req.getRequestDispatcher("views/check_out.jsp");
		rq.forward(req, resp);
	}

	public static void main(String[] args) {
		StoreService storeService = new StoreServiceImpl();
		OrderService orderService = new OrderServiceImpl();
		CartItemService cartItemService = new CartItemServiceImpl();
		UserModel user = new UserModel(2, "Tung", "Lai Khanh", "1234", "user");
		List<CartItemModel> list = cartItemService.getCartItemByUserIdFromCart(user.getId());
		OrderModel order = new OrderModel();
		 order.set_userId(user); order.set_storeId(storeService.getStoreById(1));
		 order.set_phone("012384612"); order.set_address("asjhaskdf");
		 order.set_status("waiting");
		 
		// orderService.addToOrder(order);

			OrderModel order1 = orderService.getLastOrder();

			OrderItemModel orderItem = new OrderItemModel();
			for (CartItemModel p : list) {
				orderItem.set_orderId(order);
				orderItem.set_productId(p.get_productId());
				orderItem.setCount(p.get_count());
				orderService.addToOrderItem(orderItem, order1.getId());
			}
			System.out.print(order1.getId());
	}
}
