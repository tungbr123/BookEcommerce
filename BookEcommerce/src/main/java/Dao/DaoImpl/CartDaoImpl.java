package Dao.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.DBConnection;
import Dao.CartDao;
import Dao.LoginDao;
import Dao.ProductDao;
import Dao.StoreDao;
import Models.CartItemModel;
import Models.CartModel;
import Models.ProductModel;
import Models.StoreModel;
import Models.UserModel;
import Service.CartService;
import Service.ProductService;
import Service.ServiceImpl.CartServiceImpl;
import Service.ServiceImpl.ProductServiceImpl;

public class CartDaoImpl implements CartDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	

	ProductDao productDao= new ProductDaoImpl();
	LoginDao loginDao= new LoginDaoImpl();
	StoreDao storeDao= new StoreDaoImpl();
	@Override
	public void addToCart(CartModel cart) {

		String sql = "insert into [dbo].[Cart] (userId,storeId) values(?,?)";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, cart.get_userId().getId());
			ps.setInt(2, cart.get_storeId().get_id());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void addToCartItem(CartItemModel cartItem, int id) {

		String sql = "insert into [dbo].[CartItem] (cartId,productId,count) values(?,?,?)";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setInt(2, cartItem.get_productId().getId());
			ps.setInt(3, cartItem.get_count());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public CartModel getLastCart() {

		String sql = "SELECT TOP 1 * FROM Cart ORDER BY _id DESC";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new CartModel(rs.getInt(1), loginDao.getUserById(rs.getInt(2)), storeDao.getStoreById(rs.getInt(3)),
						rs.getDate(4), rs.getDate(5));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public CartModel getCartById(int id) {

		String sql = "select * from Cart where _id=?";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new CartModel(rs.getInt(1), loginDao.getUserById(rs.getInt(2)), storeDao.getStoreById(rs.getInt(3)),
						rs.getDate(4), rs.getDate(5));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<CartItemModel> getCartItemByCardId(int id) {
		List<CartItemModel> list = new ArrayList<>();
		String sql = "select * from CartItem where cartId=?";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new CartItemModel(rs.getInt(1), new CartModel(rs.getInt(2)) , new ProductModel(rs.getInt(3)),
						rs.getInt(4), rs.getDate(5), rs.getDate(6)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	

	

	public static void main(String[] args) {
		CartDao cartService= new CartDaoImpl();
		ProductDao productService= new ProductDaoImpl();
		
		List<CartItemModel> list = new ArrayList<>();
		CartModel cart= cartService.getCartById(28);

		ProductModel product= productService.getProductByID(2);
		
		System.out.print(cart);
	}



}
