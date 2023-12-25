package ex4a;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NunmberServlet
 */
@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		int value = Integer.parseInt(request.getParameter("value"));
		
		int atari = new Random().nextInt(5);
		atari++;

		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>数当てゲーム</title></head><body>");
		
		if( value == atari) {
			out.println("<h1>あたり！！　おめでとうございます。</h1>");
			out.println("<img src=\"atari.png\"/>");
		}else {
			
			out.println("<h1>はずれ！！　残念でした</h1>");
			out.println("<img src=\"hazure.png\"/>");
		
			out.println("<br>");
			out.println("<a href=\"numberGame.html\">もう一回チャレンジする</a>");
		}
	
	}

}
