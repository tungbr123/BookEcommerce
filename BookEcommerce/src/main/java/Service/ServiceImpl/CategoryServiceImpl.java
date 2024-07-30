package Service.ServiceImpl;

import java.util.List;

import Dao.CategoryDao;

import Dao.DaoImpl.CategoryDaoImpl;

import Models.CategoryModel;
import Service.CategoryService;

public class CategoryServiceImpl implements CategoryService{
	CategoryDao cate= new CategoryDaoImpl();
	@Override
	public List<CategoryModel> getAllChildCategory() {
		// TODO Auto-generated method stub
		return cate.getAllChildCategory();
	}
	@Override
	public CategoryModel getCategoryByID(int cid) {
		// TODO Auto-generated method stub
		return cate.getCategoryByID(cid);
	}
	
}
