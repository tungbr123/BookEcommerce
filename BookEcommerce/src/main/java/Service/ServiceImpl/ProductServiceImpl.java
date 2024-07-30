package Service.ServiceImpl;

import java.util.List;

import Dao.ProductDao;
import Dao.DaoImpl.ProductDaoImpl;
import Models.ProductModel;
import Service.ProductService;

public class ProductServiceImpl implements ProductService{
	ProductDao productDao= new ProductDaoImpl();
	@Override
	public List<ProductModel> searchByProductName(String txts) {
		return productDao.searchByProductName(txts);
	}
	@Override
	public List<ProductModel> getAllProductOrderedByName() {
		// TODO Auto-generated method stub
		return productDao.getAllProductOrderedByName();
	}
	@Override
	public List<ProductModel> getAllProductOrderedByPrice() {
		// TODO Auto-generated method stub
		return productDao.getAllProductOrderedByPrice();
	}
	@Override
	public List<ProductModel> getAllProduct() {
		// TODO Auto-generated method stub
		return productDao.getAllProduct();
	}
	@Override
	public List<ProductModel> getAllProductByAmount(int amount) {
		// TODO Auto-generated method stub
		return productDao.getAllProductByAmount(amount);
	}
	@Override
	public List<ProductModel> getAllProductByIndex(int index) {
		// TODO Auto-generated method stub
		return productDao.getAllProductByIndex(index);
	}
	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return productDao.countAll();
	}
	@Override
	public List<ProductModel> getAllProductByKeywordAndIndex(String keyword, int index) {
		// TODO Auto-generated method stub
		return productDao.getAllProductByKeywordAndIndex(keyword, index);
	}
	@Override
	public List<ProductModel> getAllProductByCategoryAndPage(int cid, int page) {
		// TODO Auto-generated method stub
		return productDao.getAllProductByCategoryAndPage(cid, page);
	}
	@Override
	public List<ProductModel> getAllProductByCategory(int cid) {
		// TODO Auto-generated method stub
		return productDao.getAllProductByCategory(cid);
	}
	@Override
	public List<ProductModel> getAllProductByCategoryPageAndName(int cid, int page) {
		// TODO Auto-generated method stub
		return productDao.getAllProductByCategoryPageAndName(cid, page);
	}
	@Override
	public List<ProductModel> getAllProductByCategoryPageAndPrice(int cid, int page) {
		// TODO Auto-generated method stub
		return productDao.getAllProductByCategoryPageAndPrice(cid, page);
	}
	@Override
	public ProductModel getProductByIDAndCategoryID(int pid, int cid) {
		// TODO Auto-generated method stub
		return productDao.getProductByIDAndCategoryID(pid, cid);
	}
	@Override
	public ProductModel getProductByID(int id) {
		// TODO Auto-generated method stub
		return productDao.getProductByID(id);
	}

}
