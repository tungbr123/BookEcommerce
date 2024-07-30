package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Models.CategoryModel;
import Models.ProductModel;
import Service.CategoryService;
import Service.ProductService;
import Service.ServiceImpl.CategoryServiceImpl;
import Service.ServiceImpl.ProductServiceImpl;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/productDetail"})
public class ProductDetailController extends HttpServlet{
	CategoryService cate= new CategoryServiceImpl();
	ProductService product= new ProductServiceImpl();
	/**
	 *
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String pid= req.getParameter("pid");
		String cid=req.getParameter("cid");	
		
		int pid1= Integer.parseInt(pid); 
		int cid1= Integer.parseInt(cid);
		
		ProductModel pro= product.getProductByIDAndCategoryID(pid1, cid1);
		CategoryModel category= cate.getCategoryByID(cid1); 
		HttpSession session = req.getSession();
		session.setAttribute("product", pro);
		req.setAttribute("pid", pid);
		req.setAttribute("cid", cid);
		req.setAttribute("product", pro);
		req.setAttribute("cate", category);
		
		req.getRequestDispatcher("views/productdetail.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String sign="success";
		
		String mess= "Your product is added to your cart successfully!";
		String quantity= req.getParameter("quantity");
		
		if(quantity==null)
			quantity="1";
		HttpSession session = req.getSession();
		session.setAttribute("quantity", quantity);
		session.setAttribute("sign", sign);
		req.setAttribute("quantity", quantity);
		req.setAttribute("mess",mess);
		req.getRequestDispatcher("views/productdetail.jsp").forward(req, resp);
	}
	public static void main(String[] args) {
		ProductService product= new ProductServiceImpl();
		ProductModel pro= product.getProductByIDAndCategoryID(6, 2);
		System.out.print(pro);
	}
	
}
