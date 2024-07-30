package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Models.CartItemModel;
import Models.CartModel;
import Models.ProductModel;
import Models.StoreModel;
import Models.UserModel;
import Service.CartItemService;
import Service.CartService;
import Service.StoreService;
import Service.ServiceImpl.CartItemServiceImpl;
import Service.ServiceImpl.CartServiceImpl;
import Service.ServiceImpl.StoreServiceImpl;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/cart" })
public class CartController extends HttpServlet {

	CartItemService cartItemService = new CartItemServiceImpl();
	CartService cartService = new CartServiceImpl();
	StoreService storeService = new StoreServiceImpl();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession session = req.getSession();
		String sign = session.getAttribute("sign").toString();
		UserModel user = (UserModel) session.getAttribute("acc");
		if (sign.equals("success")) {
			String id = req.getParameter("id");
			int userId = Integer.parseInt(id);

			String quantity = session.getAttribute("quantity").toString();

			int qty = Integer.parseInt(quantity);

				ProductModel pro = (ProductModel) session.getAttribute("product");

			if (pro != null) {
				CartModel cart = new CartModel();
				cart.set_storeId(storeService.getStoreById(pro.get_storeId()));
				cart.set_userId(user);
				cartService.addToCart(cart);

				CartModel cart1 = cartService.getLastCart();

				CartItemModel cartItem = new CartItemModel();

				cartItem.set_cartId(cart1);
				cartItem.set_count(qty);
				cartItem.set_productId(pro);
				cartService.addToCartItem(cartItem, cart1.getId());
				session.removeAttribute("product");
			}

			List<CartItemModel> list = cartItemService.getCartItemByUserIdFromCart(user.getId());
			int total = 0;
			for (CartItemModel p : list) {
				total = total + (p.get_count() * p.get_productId().get_promotionalPrice());
			}
			session.setAttribute("total", total);
			req.setAttribute("ListCartItem", list);
		
		}
		if(sign.equals("delete"))
		{
			List<CartItemModel> list = cartItemService.getCartItemByUserIdFromCart(user.getId());
			int total = 0;
			for (CartItemModel p : list) {
				total = total + (p.get_count() * p.get_productId().get_promotionalPrice());
			}
			req.setAttribute("total", total);
			req.setAttribute("ListCartItem", list);
		}
		List<CartItemModel> list = cartItemService.getCartItemByUserIdFromCart(user.getId());
		int count=0;
		for (CartItemModel p : list) {
			count= count + 1;
		}
		session.setAttribute("countCartItem", count);
		req.getRequestDispatcher("views/cart.jsp").forward(req, resp);
	}

	public static void main(String[] args) {
		CartItemService cartItemService = new CartItemServiceImpl();
		List<CartItemModel> list = cartItemService.getCartItemByUserIdFromCart(3);
		int total = 0;
		for (CartItemModel p : list) {
			total = total + (p.get_count() * p.get_productId().get_promotionalPrice());
		}

		System.out.print(list);
	}
}
