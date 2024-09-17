package Dao;

import java.util.List;

import Models.CartItemModel;
import Models.CartModel;

public interface CartDao {

	void addToCartItem(CartItemModel cartItem, int id);

	void addToCart(CartModel cart);

	CartModel getLastCart();

	public List<CartItemModel> getCartItemByCardId(int id);

	CartModel getCartById(int id);



}
