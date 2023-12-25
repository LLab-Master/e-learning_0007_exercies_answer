package ex7a;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String operand = request.getParameter("operand");
		
		Calc calc = new Calc();

		int answer = 0;
		switch(operand) {
		case "plus":
			answer = calc.plus(num1,num2);
			break;
		case "minus":
			answer = calc.minus(num1,num2);
			break;
		case "multi":
			answer = calc.multiply(num1, num2);
			break;
		case "div":
			answer = calc.divide(num1, num2);
			break;
		
		}
		
		request.setAttribute("answer",answer );
		RequestDispatcher rd = request.getRequestDispatcher("answer.jsp");
		rd.forward(request, response);
		
	}

}
