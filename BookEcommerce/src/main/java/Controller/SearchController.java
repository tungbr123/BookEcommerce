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
@WebServlet(urlPatterns = {"/search"})
public class SearchController extends HttpServlet{
	ProductService productService= new ProductServiceImpl();
	CategoryService categoryService= new CategoryServiceImpl();
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String keyword= req.getParameter("keyword");
		

		int kt1=0;
		List<CategoryModel> listCate= categoryService.getAllChildCategory();
		List<ProductModel> listAllProduct= new ArrayList<>();
		List<ProductModel> listAllProduct1= productService.searchByProductName(keyword);

		listAllProduct= productService.getAllProductByKeywordAndIndex(keyword, 1);
		int count= listAllProduct1.size();
		int endPage= count/2;
		if(count%2 !=0)
			endPage++;
		req.setAttribute("listS", listAllProduct);
		req.setAttribute("endPage", endPage);
		req.setAttribute("keyword", keyword);
		req.setAttribute("listC", listCate);
		req.setAttribute("kt1", kt1);
		RequestDispatcher rq= req.getRequestDispatcher("views/search.jsp");
		rq.forward(req, resp);

	}

}
