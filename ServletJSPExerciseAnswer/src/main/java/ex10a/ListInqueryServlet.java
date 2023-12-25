package ex10a;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListInqueryServlet
 */
@WebServlet("/listInquery")
public class ListInqueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// DB store
		InqueryLogic inqueryLogic = new InqueryLogic();
		List<Inquery> inqueryList = inqueryLogic.getInqueryList();
		inqueryLogic.close();
		
		request.setAttribute("inqueryList", inqueryList);
		// forward
		RequestDispatcher rd = request.getRequestDispatcher("listInquery.jsp");
		rd.forward(request, response);

	}
}
