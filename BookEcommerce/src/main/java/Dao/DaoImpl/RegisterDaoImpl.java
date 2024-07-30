package Dao.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.DBConnection;
import Dao.RegisterDao;
import Models.UserModel;

public class RegisterDaoImpl implements RegisterDao{
	Connection conn= null;
	PreparedStatement ps= null;
	ResultSet rs= null;
	@Override
	public void register(String firstname, String lastname, String email, String phone, String password) {
		String role = "user";
		String sql="INSERT INTO [dbo].[User] (firstname,lastname,email,phone,hashed_password,role) values(?,?,?,?,?,?)";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, email);
			ps.setString(4, phone);
			ps.setString(5, password);
			ps.setString(6, role);
			ps.executeUpdate();
		} catch (Exception e) {
			
		}
	}
	/*
	 * public boolean checkEmail(String email) { String sql=
	 * "select * from [dbo].[User]  where email='?'"; }
	 */
	@Override
	public boolean checkExistEmail(String email) {
		boolean duplicate= false;
		String sql="select * from [dbo].[User] where email=?";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, email);
			rs=ps.executeQuery();
			if(rs.next())
			{
				duplicate=true;
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return duplicate;
	}
	@Override
	public boolean checkExistPhone(String phone) {
		boolean duplicate= false;
		String sql="select * from [dbo].[User] where phone=?";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, phone);
			rs=ps.executeQuery();
			if(rs.next())
			{
				duplicate=true;
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return duplicate;
	}
	@Override
	public boolean checkExistCurrentPass(String email, String pass) {
		boolean duplicate= false;
		String sql="select * from [dbo].[User] where email=?";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, email);
			rs=ps.executeQuery();
			while(rs.next())
			{
				if(rs.getString("hashed_password").equals(pass))
					duplicate=true;
				else
					duplicate=false;
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return duplicate;
	}

}
