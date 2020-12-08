package Test.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test.entity.Product;
import Test.service.GameService;
import Test.service.GameServiceImpl;

@WebServlet("/SearchAllGameServlet")
public class SearchAllGameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchAllGameServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GameService gs = new GameServiceImpl();
		List<Product> list = gs.SearchAllGame();
		request.setAttribute("allGames", list);
		RequestDispatcher rd = request.getRequestDispatcher("showAllGames.jsp");
		rd.forward(request, response);
		return;
	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		doGet(request, response);
//	}

}
