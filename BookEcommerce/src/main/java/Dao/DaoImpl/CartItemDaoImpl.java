package Dao.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.DBConnection;
import Dao.CartDao;
import Dao.CartItemDao;
import Dao.LoginDao;
import Dao.ProductDao;
import Dao.StoreDao;
import Models.CartItemModel;
import Models.CartModel;
import Models.ProductModel;

public class CartItemDaoImpl implements CartItemDao{
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	ProductDao productDao= new ProductDaoImpl();
	LoginDao loginDao= new LoginDaoImpl();
	StoreDao storeDao= new StoreDaoImpl();
	CartDao cartDao= new CartDaoImpl();
	@Override
	public  List<CartItemModel> getCartItemByUserIdFromCart(int id) {
		List<CartItemModel> list = new ArrayList<>();
		String sql = "select * from CartItem, Cart \r\n"
				+ "where CartItem.cartId = Cart._id and Cart.userId=?";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
	
			while (rs.next()) {

				list.add(new CartItemModel(rs.getInt(1), cartDao.getCartById(rs.getInt(2)) , productDao.getProductByID(rs.getInt(3)),
						rs.getInt(4), rs.getDate(5), rs.getDate(6)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	@Override
	public void deleteCartItemById(int id)
	{
		String sql="delete from CartItem where _id=?";
		try {
			conn= new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		CartItemDao cartItemService= new CartItemDaoImpl();
		CartDao cartService= new CartDaoImpl();
		ProductDao productService= new ProductDaoImpl();
		CartModel cart= cartService.getCartById(28);
		List<CartItemModel> list= cartItemService.getCartItemByUserIdFromCart(1);
		ProductModel product= productService.getProductByID(2);
		
		System.out.print(list);
	}
}
