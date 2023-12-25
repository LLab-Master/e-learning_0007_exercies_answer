package ex6b;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UranaiServlet
 */
@WebServlet("/inqueryB")
public class InqueryServletB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// message を空にして inquery.jsp へフォワード
		request.setAttribute("message", "");
		RequestDispatcher rd = request.getRequestDispatcher("inqueryB.jsp");
		rd.forward(request, response);
	}

}
