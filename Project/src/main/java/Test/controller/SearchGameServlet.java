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

import Test.entity.Product;
import Test.service.GameService;
import Test.service.GameServiceImpl;

@WebServlet("/SearchGameServlet")
public class SearchGameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchGameServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		GameService gs = new GameServiceImpl();
		String productId = request.getParameter("productId");
		String C_name = request.getParameter("c_name");
		String G_maker = request.getParameter("gmaker");
		String iss = request.getParameter("iss");
		if (productId != null) {
			Integer productId1 = Integer.valueOf(productId);
			Product gb = gs.SearchGame(productId1);
			request.setAttribute("gb", gb);
			RequestDispatcher rd = request.getRequestDispatcher("UpdateGame.jsp");
			rd.forward(request, response);
			return;
		}
		if (C_name != null) {

			List<Product> list = gs.SearchGame(C_name);
			request.setAttribute("gb", list);
			RequestDispatcher rd = request.getRequestDispatcher("showAllGames2.jsp");
			rd.forward(request, response);
			return;
		}
		if (G_maker != null) {

			List<Product> list = gs.SearchGame1(G_maker);
			request.setAttribute("gb", list);
			RequestDispatcher rd = request.getRequestDispatcher("showAllGames2.jsp");
			rd.forward(request, response);
			return;
		}
		if (iss != null) {

			List<Product> list = gs.SearchGame2(iss);
			request.setAttribute("gb", list);
			RequestDispatcher rd = request.getRequestDispatcher("showAllGames2.jsp");
			rd.forward(request, response);
			return;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
