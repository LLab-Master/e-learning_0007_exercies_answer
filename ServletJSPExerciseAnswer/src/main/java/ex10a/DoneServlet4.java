package ex10a;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UranaiServlet
 */
@WebServlet("/done4")
public class DoneServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// session を無効にしたいので、 リクエストスコープに値を移動 
		HttpSession session = request.getSession();
		Inquery inquery = (Inquery)session.getAttribute("inquery");
		request.setAttribute("inquery", inquery);

		// session を無効に
		session.invalidate();
		
		// DB store
		InqueryLogic inqueryLogic = new InqueryLogic();
		inqueryLogic.insert(inquery);
		inqueryLogic.close();
		
		// forward
		RequestDispatcher rd = request.getRequestDispatcher("done4.jsp");
		rd.forward(request, response);
	}

}
