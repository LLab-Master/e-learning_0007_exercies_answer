package ex6a;

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
@WebServlet("/inquery")
public class InqueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// message を空にして inquery.jsp へフォワード
		request.setAttribute("message", "");
		RequestDispatcher rd = request.getRequestDispatcher("inquery.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		if( name.equals("")) { // name.isEmpty() name == null name == ""
			String message = "氏名は必須です";
			request.setAttribute("message", message);
			RequestDispatcher rd = request.getRequestDispatcher("inquery.jsp");
			rd.forward(request, response);
//			return;
		}
		int age = 0;
		try{
			age = Integer.parseInt(request.getParameter("age"));
		}catch(NumberFormatException e) {
			e.printStackTrace();
			String message = "年齢は数字で入力";
			request.setAttribute("message", message);
			RequestDispatcher rd = request.getRequestDispatcher("inquery.jsp");
			rd.forward(request, response);
		}
				
		String zipcode = request.getParameter("zipcode");		
		if( !zipcode.matches("[0-9]{3}-[0-9]{4}")) {
			
			String message = "郵便番号は3桁-4桁";
			request.setAttribute("message", message);
			RequestDispatcher rd = request.getRequestDispatcher("inquery.jsp");
			rd.forward(request, response);
		}
		
		String address = request.getParameter("address");
		String body = request.getParameter("body");
		
		Inquery inquery = new Inquery(name, age, zipcode, address, body);
		request.setAttribute("inquery", inquery);
		RequestDispatcher rd = request.getRequestDispatcher("done.jsp");
		rd.forward(request, response);		
	}

}
