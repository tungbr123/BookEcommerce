package Service.ServiceImpl;


import java.util.List;

import Dao.CartDao;
import Dao.DaoImpl.CartDaoImpl;
import Models.CartItemModel;
import Models.CartModel;
import Service.CartService;

public class CartServiceImpl implements CartService{
	CartDao cartService= new CartDaoImpl();

	
	@Override
	public void addToCart(CartModel cart) {
		cartService.addToCart(cart);
		
	}

	@Override
	public CartModel getLastCart() {
		// TODO Auto-generated method stub
		return cartService.getLastCart();
	}

	@Override
	public void addToCartItem(CartItemModel cartItem, int id) {
		cartService.addToCartItem(cartItem, id);
		
	}

	@Override
	public List<CartItemModel> getCartItemByCardId(int id) {
		// TODO Auto-generated method stub
		return cartService.getCartItemByCardId(id);
	}

	




}
