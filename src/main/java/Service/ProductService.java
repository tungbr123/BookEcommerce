package Service;

import java.util.List;

import Models.ProductModel;

public interface ProductService {
	List<ProductModel> searchByProductName(String txts);
	List<ProductModel> getAllProductOrderedByName();

	List<ProductModel> getAllProductOrderedByPrice();

	List<ProductModel> getAllProduct();
	List<ProductModel> getAllProductByAmount(int amount);
	List<ProductModel> getAllProductByIndex(int index);
	int countAll();
	List<ProductModel> getAllProductByKeywordAndIndex(String keyword, int index);
	List<ProductModel> getAllProductByCategoryAndPage(int cid, int page);
	List<ProductModel> getAllProductByCategory(int cid);
	List<ProductModel> getAllProductByCategoryPageAndName(int cid, int page);
	List<ProductModel> getAllProductByCategoryPageAndPrice(int cid, int page);
	ProductModel getProductByIDAndCategoryID(int pid, int cid);
	ProductModel getProductByID(int id);
}
