package Test.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.query.Query;

import Test.entity.Product;
import Test.service.GameService;
import Test.service.GameServiceImpl;

@WebServlet("/AdvancedSearch")
public class AdvancedSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdvancedSearch() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 讀取輸入資料
		String productId = request.getParameter("productId");
		String E_name = request.getParameter("E_name");
		String C_name = request.getParameter("C_name");
		String img_url = request.getParameter("img_url");
		String G_make = request.getParameter("G_make");
		String iss = request.getParameter("iss");
		String info = request.getParameter("info");
		String Price = request.getParameter("Price");
		String viewCount = request.getParameter("viewCount");
		String date = request.getParameter("date");
		String storage = request.getParameter("storage");

		Integer productId1 = Integer.valueOf(productId);
		Integer price1 = Integer.valueOf(Price);
		Integer viewCount1 = Integer.valueOf(viewCount);
		Integer storage1 = Integer.valueOf(storage);

		GameService gs = new GameServiceImpl();
		HttpSession session = request.getSession();

		Product gb = new Product(productId1, E_name, C_name, img_url, G_make, iss, info, price1, viewCount1, date,
				storage1);
		List<Product> list =gs.AdvancedSearch(gb);
		session.setAttribute("allGames", list);
		RequestDispatcher rd = request.getRequestDispatcher("showAllGames.jsp");
		rd.forward(request, response);
		return;


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
