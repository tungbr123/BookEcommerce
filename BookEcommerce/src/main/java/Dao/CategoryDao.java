package Dao;

import java.util.List;

import Models.CategoryModel;

public interface CategoryDao {

	List<CategoryModel> getAllChildCategory();

	CategoryModel getCategoryByID(int cid);

}
