package Dao.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.DBConnection;
import Dao.CheckOutDao;
import Dao.LoginDao;
import Dao.ProductDao;
import Dao.StoreDao;
import Models.CartModel;
import Models.OrderItemModel;
import Models.OrderModel;

public class CheckOutDaoImpl implements CheckOutDao{
	Connection conn= null;
	PreparedStatement ps= null;
	ResultSet rs= null;
	
	ProductDao productDao= new ProductDaoImpl();
	LoginDao loginDao= new LoginDaoImpl();
	StoreDao storeDao= new StoreDaoImpl();
	@Override
	public void addToOrder(OrderModel order)
	{
		String sql= "insert into \"Order\"(userId, storeId, address, phone, status) values(?,?,?,?,?)";
		try {
			conn= new DBConnection().getConnection();
			ps= conn.prepareStatement(sql);
			ps.setInt(1, order.get_userId().getId());
			ps.setInt(2, order.get_storeId().get_id());
			ps.setString(3, order.get_address());
			ps.setString(4, order.get_phone());
			ps.setString(5, order.get_status());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	@Override
	public void addToOrderItem(OrderItemModel orderItem, int orderID)
	{
		String sql= "insert into OrderItem(orderId,productId,count) values (?,?,?)";
		try {
			conn= new DBConnection().getConnection();
			ps= conn.prepareStatement(sql);
			ps.setInt(1, orderID);	
			ps.setInt(2, orderItem.get_productId().getId());
			ps.setInt(3, orderItem.getCount());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Override
	public OrderModel getLastOrder() {

		String sql = "SELECT TOP 1 * FROM \"Order\" ORDER BY _id DESC";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new OrderModel(rs.getInt(1), loginDao.getUserById(rs.getInt(2)), storeDao.getStoreById(rs.getInt(3)),
						rs.getString(4), rs.getString(5),rs.getString(6),rs.getBoolean(7), rs.getDate(8), rs.getDate(9));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
