package Dao.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.DBConnection;
import Dao.LoginDao;
import Models.UserModel;

public class LoginDaoImpl implements LoginDao{
	Connection conn= null;
	PreparedStatement ps= null;
	ResultSet rs= null;
	public UserModel login(String email, String password)
	{
		String sql= "select * from [dbo].[User] where email=? and hashed_password=?";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);

			ps.setString(1, email);

			ps.setString(2, password);
			rs=ps.executeQuery();
			while(rs.next())	
			{
				return new UserModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getBoolean(8),rs.getBoolean(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getFloat(16),rs.getInt(17),rs.getDate(18),rs.getDate(19));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	@Override
	public UserModel loginEmail(String email) {
		String sql= "select * from [dbo].[User] where email=?";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);

			ps.setString(1, email);

			rs=ps.executeQuery();
			while(rs.next())	
			{
				return new UserModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(5),rs.getString(6),rs.getBoolean(8),rs.getBoolean(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getFloat(16),rs.getInt(17),rs.getDate(17),rs.getDate(18));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	@Override
	public void updatePass(String email, String password)
	{
		String sql="update [dbo].[User] set hashed_password= ? where email=? ";
		try {
			conn= new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, password);
			ps.setString(2, email);
			ps.executeUpdate();
		} catch (Exception e) {

		}
	}
	@Override
	public void updateProfile(UserModel user)
	{
		String sql="update [dbo].[User] set firstname=?,lastname=?,email=?, hashed_password=?,phone=?,addresses=?, avatar=? where _id=? ";
		try {
			conn= new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, user.get_firstname());
			ps.setString(2, user.get_lastname());
			ps.setString(3, user.get_email());
			ps.setString(4, user.get_hashed_password());
			ps.setString(5, user.get_phone());
			ps.setString(6, user.get_addresses());
			ps.setString(7, user.get_avatar());
			ps.setInt(8, user.getId());	

			ps.executeUpdate();
		} catch (Exception e) {

		}
	}
	@Override
	public UserModel getUserById(int id)
	{
		String sql= "select * from [dbo].[User] where _id=?";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);

			ps.setInt(1, id);

			rs=ps.executeQuery();
			while(rs.next())	
			{
				return new UserModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(5),rs.getString(6),rs.getBoolean(8),rs.getBoolean(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getFloat(16),rs.getInt(17),rs.getDate(17),rs.getDate(18));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public static void main(String[] args) {
		LoginDao login= new LoginDaoImpl();
		UserModel user=  new UserModel();
		user.set_firstname("Tùng");
		user.set_lastname("Lai Khánh");
		user.set_email("tungvippro456@gmail.com");
		user.set_hashed_password("1234");
		user.set_phone("0582481045");
		user.set_avatar("images/318233245_690796972428454_5214172061071526534_n.jpg");
		user.set_addresses("36/21/đường số 6/ phường linh  chiểu/TP.Thủ Đức/TP.HCM");
		user.setId(2);
		login.updateProfile(user);
	}
}
