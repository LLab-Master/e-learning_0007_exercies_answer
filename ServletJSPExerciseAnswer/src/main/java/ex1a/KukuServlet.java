package ex1a;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KukuServlet
 */
@WebServlet("/KukuServlet")
public class KukuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html;charset=UTF-8"); //ブラウザへ送り返すデータの種類と文字コードの指示
		
		PrintWriter out = response.getWriter(); 
		/*
		*HTML出力用のWriterの取得。System.out.println()と同じイメージでHTMLを出力すれば
		*ブラウザへ返すことができる
		*/
		
		
		
		out.println("<html><head><title>九九の表</title></head><body>");
		out.println("<h1>九九の表</h1>");
		
		out.println("<table border=\"1\"");
		for(int i = 1; i < 10; i++) {	
			out.println("<tr>");
			
			for( int j = 1; j < 10; j++) {
				out.println("<td>");
				out.println(i*j);
				out.println("</td>");
			}
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

	}

	
}
