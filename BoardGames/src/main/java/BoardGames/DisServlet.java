//package BoardGames;
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/")
//public class DisServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	private DisDAO disDAO;
//
//	public void init() {
//		disDAO = new DisDAO();
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		doGet(request, response);
//	}
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		String action = request.getServletPath();
//
//		try {
//			switch (action) {
//			case "/new":
//				showNewForm(request, response);
//				break;
//			case "/insert":
//				insertComment(request, response);
//				break;
//			case "/delete":
//				deleteComment(request, response);
//				break;
//			case "/update":
//				updateComment(request, response);
//				break;
//
//			default:
//				listofDis(request, response);
//				break;
//			}
//		} catch (SQLException ex) {
//			throw new ServletException(ex);
//		}
//	}
//
//	private void listofDis(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//		List<SetDis> listofDis = disDAO.getDis();
//		request.setAttribute("listofDis", listofDis);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	private void insertComment(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException {
//		Integer id = Integer.parseInt(request.getParameter("id"));
//		String name = request.getParameter("name");
//		String comment = request.getParameter("comment");
//		String date = request.getParameter("date");
//		String pic = request.getParameter("pic");
//		SetDis newDis = new SetDis(id, name, comment, date, pic);
//		disDAO.insert(newDis);
//		//System.out.println(id);
//		response.sendRedirect("list");
//	}
//	private void updateComment(HttpServletRequest request, HttpServletResponse response)
//		    throws SQLException, IOException {
//		Integer id = Integer.parseInt(request.getParameter("id"));
//		String name = request.getParameter("name");
//		String comment = request.getParameter("comment");
//		String date = request.getParameter("date");
//		String pic = request.getParameter("pic");
//		SetDis newDis = new SetDis(id, name, comment, date, pic);
//		        disDAO.update(newDis);
//		        response.sendRedirect("list");
//		    }
//
//	 private void deleteComment(HttpServletRequest request, HttpServletResponse response)
//			    throws SQLException, IOException {
//		 Integer id = Integer.parseInt(request.getParameter("id"));
//			      disDAO.delete(id);
//			        response.sendRedirect("list");
//			    }
//}
