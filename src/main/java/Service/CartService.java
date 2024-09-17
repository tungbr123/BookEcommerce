package Service;

import java.util.List;

import Models.CartItemModel;
import Models.CartModel;

public interface CartService {
	void addToCartItem(CartItemModel cartItem, int id);

	void addToCart(CartModel cart);
	CartModel getLastCart();
	List<CartItemModel> getCartItemByCardId(int id);

}
