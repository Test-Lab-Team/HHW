package BoardGames;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SetDis dis = new SetDis();
//	DAOImpl daoImpl = new DAOImpl();
//	DisDAO2 disDAO2;
	private DisDAO disDAO;

	public void init() {
		disDAO = new DisDAO();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("AAAAAAAAA");
		System.out.println(action);
		System.out.println("AAAAAAAAA");
		try {
			switch (action) {
			// case "/new":
			// showNewForm(request, response);
			// break;
			case "insert":
				insertComment(request, response);
				break;
			case "delete":
				deleteComment(request, response);
				break;
			case "update":
				updateComment(request, response);
				break;

			default:
				// listofDis(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

//	private void listofDis(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//		List<SetDis> listofDis = disDAO2.getDis();
//		request.setAttribute("listofDis", listofDis);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
//		dispatcher.forward(request, response);
//	}

//	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
//		dispatcher.forward(request, response);
//	}

	private void insertComment(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
//		if (request.getParameter("insert")!=null) {
//			String id = request.getParameter("id");
//			String name = request.getParameter("name");
//			String comment = request.getParameter("comment");
//			String date = request.getParameter("date");
//			daoImpl.insert(dis);
//			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//			rd.forward(request, response);
		System.out.println("AAAAAAAAA");
//		}
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String comment = request.getParameter("comment");
		String date = request.getParameter("date");
		// String pic = request.getParameter("pic");
		SetDis dis = new SetDis(id, name, comment, date);
		disDAO.insert(dis);

		response.sendRedirect("list");
	}

	private void updateComment(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String id = request.getParameter("id");
//		String name = request.getParameter("name");
		String comment = request.getParameter("comment");
//		String date = request.getParameter("date");
//		String pic = request.getParameter("pic");
//		SetDis dis = new SetDis(id, name, comment, date);
		disDAO.update(id,comment);
		response.sendRedirect("list");
	}

	private void deleteComment(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String id = request.getParameter("id");
		disDAO.delete(id);
		response.sendRedirect("list");
	}
}
