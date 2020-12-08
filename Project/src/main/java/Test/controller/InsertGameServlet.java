package Test.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Test.entity.Product;
import Test.service.GameService;
import Test.service.GameServiceImpl;


@WebServlet("/InsertGameServlet")
public class InsertGameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public InsertGameServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		// 讀取輸入資料
//		String productId = request.getParameter("productId");
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

		// 進行必要的型態轉換，
//		Integer productId1 = Integer.valueOf(productId);
		Integer price1 = Integer.valueOf(Price);
		Integer viewCount1 = Integer.valueOf(viewCount);
		Integer storage1 = Integer.valueOf(storage);
		GameService gs = new GameServiceImpl();
		HttpSession session = request.getSession();
		try {
			// 將要寫入的資料裝到Bean內
			Product gb = new Product(null, E_name, C_name, img_url, G_make, iss, info, price1, viewCount1, date,
					storage1);
			session.setAttribute("gb", gb);
			int success = gs.createGame(gb);
			
			if(success > 0) {
				String url = request.getContextPath()+ "/InsertGameSuccess.jsp";
				String targetURL = response.encodeRedirectURL(url);
				//新增資料成功,利用response.encodeRedirect送出回應,共用資料放在Session物件
				response.sendRedirect(targetURL);
				
			}
		
	}catch (Exception e) {
		// TODO: handle exception
	}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
