package Service.ServiceImpl;

import java.util.List;

import Dao.CartItemDao;
import Dao.DaoImpl.CartItemDaoImpl;
import Models.CartItemModel;
import Service.CartItemService;

public class CartItemServiceImpl implements CartItemService{
	CartItemDao cartItemDao=  new CartItemDaoImpl();
	@Override
	public List<CartItemModel> getCartItemByUserIdFromCart(int id) {
		// TODO Auto-generated method stub
		return cartItemDao.getCartItemByUserIdFromCart(id);
	}
	@Override
	public void deleteCartItemById(int id) {
		cartItemDao.deleteCartItemById(id);
		
	}

}
