 package Dao.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.DBConnection;
import Dao.ProductDao;
import Models.ProductModel;

public class ProductDaoImpl implements ProductDao{
	Connection conn= null;
	PreparedStatement ps= null;
	ResultSet rs= null;
	@Override
	
	
	public List<ProductModel> searchByProductName(String txts)
	{
		List<ProductModel> list= new ArrayList<>();
		String sql="select * from Product where name like ?";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, "%"+txts+"%");
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(new ProductModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getInt(6),
						rs.getInt(7),rs.getInt(8),rs.getBoolean(9),
						rs.getBoolean(10),rs.getString(11),rs.getInt(12),
						rs.getInt(13),rs.getInt(14),rs.getFloat(15),
						rs.getDate(16),rs.getDate(17)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;		
	}
	@Override
	public List<ProductModel> getAllProductByCategory(int cid)
	{
		List<ProductModel> list= new ArrayList<>();
		String sql="select * from Product where categoryId= ?";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, cid);
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(new ProductModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getInt(6),
						rs.getInt(7),rs.getInt(8),rs.getBoolean(9),
						rs.getBoolean(10),rs.getString(11),rs.getInt(12),
						rs.getInt(13),rs.getInt(14),rs.getFloat(15),
						rs.getDate(16),rs.getDate(17)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;		
	}
	@Override
	public List<ProductModel> getAllProduct()
	{
		List<ProductModel> list= new ArrayList<>();
		String sql="select * from Product";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(new ProductModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getInt(6),
						rs.getInt(7),rs.getInt(8),rs.getBoolean(9),
						rs.getBoolean(10),rs.getString(11),rs.getInt(12),
						rs.getInt(13),rs.getInt(14),rs.getFloat(15),
						rs.getDate(16),rs.getDate(17)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;		
	}
	
	@Override
	public List<ProductModel> getAllProductOrderedByPrice()
	{
		List<ProductModel> list= new ArrayList<>();
		String sql="select * from Product order by promotionalPrice asc";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(new ProductModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getInt(6),
						rs.getInt(7),rs.getInt(8),rs.getBoolean(9),
						rs.getBoolean(10),rs.getString(11),rs.getInt(12),
						rs.getInt(13),rs.getInt(14),rs.getFloat(15),
						rs.getDate(16),rs.getDate(17)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;		
	}
	
	@Override
	public List<ProductModel> getAllProductOrderedByName()
	{
		List<ProductModel> list= new ArrayList<>();
		String sql="select * from Product order by name asc";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(new ProductModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getInt(6),
						rs.getInt(7),rs.getInt(8),rs.getBoolean(9),
						rs.getBoolean(10),rs.getString(11),rs.getInt(12),
						rs.getInt(13),rs.getInt(14),rs.getFloat(15),
						rs.getDate(16),rs.getDate(17)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;		
	}
	@Override
	public List<ProductModel> getAllProductByAmount(int amount)
	{
		List<ProductModel> list= new ArrayList<>();
		String sql="select top(?)* from Product";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, amount);
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(new ProductModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getInt(6),
						rs.getInt(7),rs.getInt(8),rs.getBoolean(9),
						rs.getBoolean(10),rs.getString(11),rs.getInt(12),
						rs.getInt(13),rs.getInt(14),rs.getFloat(15),
						rs.getDate(16),rs.getDate(17)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;		
	}
	@Override
	public List<ProductModel> getAllProductByIndex(int index)
	{
		List<ProductModel> list= new ArrayList<>();
		String sql="select * from Product order by _id OFFSET ? row fetch next 3 rows only";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1,(index-1)*2);
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(new ProductModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getInt(6),
						rs.getInt(7),rs.getInt(8),rs.getBoolean(9),
						rs.getBoolean(10),rs.getString(11),rs.getInt(12),
						rs.getInt(13),rs.getInt(14),rs.getFloat(15),
						rs.getDate(16),rs.getDate(17)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;		
	}
	@Override
	public List<ProductModel> getAllProductByKeywordAndIndex(String keyword, int index)
	{
		List<ProductModel> list= new ArrayList<>();
		String sql="select * from Product where name like ? order by _id OFFSET ? row fetch next 2 rows only";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1,"%"+keyword+"%");
			ps.setInt(2, (index-1)*2);
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(new ProductModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getInt(6),
						rs.getInt(7),rs.getInt(8),rs.getBoolean(9),
						rs.getBoolean(10),rs.getString(11),rs.getInt(12),
						rs.getInt(13),rs.getInt(14),rs.getFloat(15),
						rs.getDate(16),rs.getDate(17)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;		
	}
	@Override
	public List<ProductModel> getAllProductByCategoryPageAndPrice(int cid, int page)
	{
		List<ProductModel> list= new ArrayList<>();
		String sql="select * from Product where categoryId =? order by promotionalPrice asc OFFSET ? row fetch next 2 rows only  ";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1,cid);
			ps.setInt(2, (page-1)*2);
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(new ProductModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getInt(6),
						rs.getInt(7),rs.getInt(8),rs.getBoolean(9),
						rs.getBoolean(10),rs.getString(11),rs.getInt(12),
						rs.getInt(13),rs.getInt(14),rs.getFloat(15),
						rs.getDate(16),rs.getDate(17)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;		
	}
	@Override
	public List<ProductModel> getAllProductByCategoryPageAndName(int cid, int page)
	{
		List<ProductModel> list= new ArrayList<>();
		String sql="select * from Product where categoryId =? order by name asc OFFSET ? row fetch next 2 rows only  ";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1,cid);
			ps.setInt(2, (page-1)*2);
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(new ProductModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getInt(6),
						rs.getInt(7),rs.getInt(8),rs.getBoolean(9),
						rs.getBoolean(10),rs.getString(11),rs.getInt(12),
						rs.getInt(13),rs.getInt(14),rs.getFloat(15),
						rs.getDate(16),rs.getDate(17)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;		
	}
	@Override
	public List<ProductModel> getAllProductByCategoryAndPage(int cid, int page)
	{
		List<ProductModel> list= new ArrayList<>();
		String sql="select * from Product where categoryId =? order by _id OFFSET ? row fetch next 2 rows only";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1,cid);
			ps.setInt(2, (page-1)*2);
			rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(new ProductModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getInt(6),
						rs.getInt(7),rs.getInt(8),rs.getBoolean(9),
						rs.getBoolean(10),rs.getString(11),rs.getInt(12),
						rs.getInt(13),rs.getInt(14),rs.getFloat(15),
						rs.getDate(16),rs.getDate(17)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;		
	}
	@Override
	public int countAll() {
		String sql="select count(*) from Product";
		try {
			conn= new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				return rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
	@Override
	public ProductModel getProductByIDAndCategoryID(int pid, int cid)
	{
		String sql= "select * from Product where _id=? and categoryId=?";
		try {
			conn= new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1,pid);
			ps.setInt(2, cid);
			rs=ps.executeQuery();
			while(rs.next())
			{
				return new ProductModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getInt(6),
						rs.getInt(7),rs.getInt(8),rs.getBoolean(9),
						rs.getBoolean(10),rs.getString(11),rs.getInt(12),
						rs.getInt(13),rs.getInt(14),rs.getFloat(15),
						rs.getDate(16),rs.getDate(17));
			};
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	@Override
	public ProductModel getProductByID(int id)
	{

		String sql="select * from Product where _id= ?";
		try {
			conn=new DBConnection().getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next())
			{
				return new ProductModel(rs.getInt(1),rs.getString(2) ,rs.getString(3),
						rs.getString(4),rs.getInt(5),rs.getInt(6),
						rs.getInt(7),rs.getInt(8),rs.getBoolean(9),
						rs.getBoolean(10),rs.getString(11),rs.getInt(12),
						rs.getInt(13),rs.getInt(14),rs.getFloat(15),
						rs.getDate(16),rs.getDate(17));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public static void main(String[] args) {
		ProductDao pro= new ProductDaoImpl();
		ProductModel list= pro.getProductByIDAndCategoryID(6, 2);
;
		System.out.print(list);
	}
	
}
