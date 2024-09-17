package Controller;

import java.io.IOException;
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
@WebServlet(urlPatterns = {"/home"})
public class HomeController extends HttpServlet{
	CategoryService cate= new CategoryServiceImpl();
	ProductService product= new ProductServiceImpl();
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");		
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		
		String cid= req.getParameter("cid");
		if(cid==null)
			cid="0";
		int cid1= Integer.parseInt(cid);
		List<CategoryModel> listC= cate.getAllChildCategory();
	
		
		
		req.setAttribute("listC", listC);
		if(cid.equals("0"))
		{
			List<ProductModel> listAllProduct= product.getAllProduct();
			req.setAttribute("listProduct", listAllProduct);
		}
		else
		{
			List<ProductModel> listProductByCategory= product.getAllProductByCategory(cid1);
			req.setAttribute("listProduct", listProductByCategory);
		}

		int kt=0;
		req.setAttribute("kt", kt);
		req.setAttribute("cid", cid1);
		RequestDispatcher rq= req.getRequestDispatcher("views/home.jsp");
		rq.forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
