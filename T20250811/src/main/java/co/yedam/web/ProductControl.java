package co.yedam.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.service.ProductService;
import co.yedam.service.ProductServiceImpl;
import co.yedam.vo.ProductVO;

public class ProductControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String code = req.getParameter("prodCode");
		
		ProductService svc = new ProductServiceImpl();
		ProductVO product = svc.productInfo(code); // 글목록.
		
		req.setAttribute("product", product);
		
		req.getRequestDispatcher("product2/productInfo.tiles")
		.forward(req, resp);
	}

}
