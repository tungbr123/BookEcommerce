package Service;

import java.util.List;

import Models.CartItemModel;

public interface CartItemService {
	List<CartItemModel> getCartItemByUserIdFromCart(int id);
	void deleteCartItemById(int id);
}
