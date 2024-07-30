package Service;

import java.util.List;

import Models.CategoryModel;

public interface CategoryService {
	List<CategoryModel> getAllChildCategory();
	CategoryModel getCategoryByID(int cid);

}
