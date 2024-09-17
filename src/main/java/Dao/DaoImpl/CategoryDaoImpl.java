package Dao.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.DBConnection;
import Dao.CategoryDao;
import Models.CategoryModel;

public class CategoryDaoImpl implements CategoryDao{
	Connection conn= null;
	PreparedStatement ps= null;
	ResultSet rs= null;
	@Override
	public List<CategoryModel> getAllChildCategory()
	{
		List<CategoryModel> list= new ArrayList<>();
		String sql="select * from Category where categoryId is not NULL";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(new CategoryModel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getBoolean(6),rs.getDate(7),rs.getDate(8)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;		
	}
	@Override
	public CategoryModel getCategoryByID(int cid)
	{
		String sql="select * from Category where _id =?";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, cid);
			rs=ps.executeQuery();
			while(rs.next())
			{
				return new CategoryModel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getBoolean(6),rs.getDate(7),rs.getDate(8));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;	
	}
}
