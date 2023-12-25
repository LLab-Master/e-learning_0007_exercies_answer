package ex2a;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CurrentTIimeServlet
 */
@WebServlet("/CurrentTIimeServlet")
public class CurrentTIimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>現在時刻の表示</title></head><body>");
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh時mm分ss秒");
		String formatDate = sdf.format(now);
		out.println("<h1>現在時刻:" + formatDate + "</h1>");
	
	}

	

}
