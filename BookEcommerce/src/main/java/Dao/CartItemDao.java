package Dao;

import java.util.List;

import Models.CartItemModel;

public interface CartItemDao {

	List<CartItemModel> getCartItemByUserIdFromCart(int id);

	void deleteCartItemById(int id);



}
