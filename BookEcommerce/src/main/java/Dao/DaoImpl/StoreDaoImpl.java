package Dao.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.DBConnection;
import Dao.StoreDao;
import Models.StoreModel;

public class StoreDaoImpl implements StoreDao{
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	@Override
	public StoreModel getStoreById(int id)
	{
		String sql= "select * from [dbo].[Store] where _id=?";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);

			ps.setInt(1, id);

			rs=ps.executeQuery();
			while(rs.next())	
			{
				return new StoreModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getBoolean(7),rs.getBoolean(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getInt(12),rs.getInt(13),rs.getFloat(14),rs.getInt(15),rs.getDate(16),rs.getDate(17));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
