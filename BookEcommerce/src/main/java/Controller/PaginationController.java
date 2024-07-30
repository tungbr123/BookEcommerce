package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.CategoryModel;
import Models.ProductModel;
import Service.CategoryService;
import Service.ProductService;
import Service.ServiceImpl.CategoryServiceImpl;
import Service.ServiceImpl.ProductServiceImpl;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/pagination" })
public class PaginationController extends HttpServlet {
	ProductService productService = new ProductServiceImpl();
	CategoryService categoryService = new CategoryServiceImpl();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		String keyword = req.getParameter("keyword");
		String page = req.getParameter("page");
		String cid = req.getParameter("cid");
		String sort = req.getParameter("sort");
		if(sort==null)
			sort="-1";
		int sort1 = Integer.parseInt(sort);
		int cid1 = Integer.parseInt(cid);
		int page1 = Integer.parseInt(page);

		List<CategoryModel> listCate = categoryService.getAllChildCategory();
		List<ProductModel> listAllProduct = new ArrayList<>();
		int kt1 = 1000;
		int count = 0;
		if (cid.equals("0")) {
			kt1 = 1;
			List<ProductModel> listAllProductByKeyword = productService.searchByProductName(keyword);
			count = listAllProductByKeyword.size();
			listAllProduct = productService.getAllProductByKeywordAndIndex(keyword, page1);
		} else {
			List<ProductModel> listAllProductByCategory = productService.getAllProductByCategory(cid1);
			kt1 = 2;
			count = listAllProductByCategory.size();
			listAllProduct = productService.getAllProductByCategoryAndPage(cid1, page1);
		}
		if (sort1 == 0) {
			List<ProductModel> listAllProductByCategory = productService.getAllProductByCategory(cid1);
			kt1 = 3;
			count = listAllProductByCategory.size();
			listAllProduct = productService.getAllProductByCategoryAndPage(cid1, page1);
		}
		if (sort1 == 1) {
			List<ProductModel> listAllProductByCategory = productService.getAllProductByCategory(cid1);
			kt1 = 3;
			count = listAllProductByCategory.size();
			listAllProduct = productService.getAllProductByCategoryPageAndPrice(cid1, page1);
		}
		if (sort1 == 2) {

			List<ProductModel> listAllProductByCategory = productService.getAllProductByCategory(cid1);
			kt1 = 3;
			count = listAllProductByCategory.size();
			listAllProduct = productService.getAllProductByCategoryPageAndName(cid1, page1);
		}
		int endPage = count / 2;
		if (count % 2 != 0)
			endPage++;
		req.setAttribute("cid", cid1);
		req.setAttribute("page", page);
		req.setAttribute("listS", listAllProduct);
		req.setAttribute("endPage", endPage);
		req.setAttribute("keyword", keyword);
		req.setAttribute("listC", listCate);
		req.setAttribute("kt1", kt1);
		req.setAttribute("sort", sort1);
		RequestDispatcher rq = req.getRequestDispatcher("views/search.jsp");
		rq.forward(req, resp);

	}

	public static void main(String[] args) {
		ProductService productService = new ProductServiceImpl();
		CategoryService categoryService = new CategoryServiceImpl();
		List<ProductModel> listAllProductByCategory = productService.getAllProductByCategoryPageAndPrice(2, 1);
		System.out.print(listAllProductByCategory);
	}

}
