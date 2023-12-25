package ex5a;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UranaiServlet
 */
@WebServlet("/uranai")
public class UranaiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		int fortune = new Random().nextInt(4) + 1;
//		fortune++;
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>占い</title></head><body>");
		out.println("<h1>占いの結果がでました</h1>");
		out.println(age + " 歳の "+ name + " さん、あなたの運気番号は "+fortune + " です。<br>");
		out.println("1:大吉 2:中吉 3:吉 4:凶");
		
				
		
	}

}
