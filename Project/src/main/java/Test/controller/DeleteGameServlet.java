package Test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test.entity.Product;
import Test.service.GameService;
import Test.service.GameServiceImpl;

@WebServlet("/DeleteGameServlet")
public class DeleteGameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteGameServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String productId = request.getParameter("productId");
		Integer productId1 = Integer.valueOf(productId);
		GameService gs = new GameServiceImpl();
		int success = gs.deleteGame(productId1);
		if(success > 0) {
			String url = request.getContextPath()+ "/SearchAllGameServlet";
			String targetURL = response.encodeRedirectURL(url);
			//新增資料成功,利用response.encodeRedirect送出回應,共用資料放在Session物件
			response.sendRedirect(targetURL);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
