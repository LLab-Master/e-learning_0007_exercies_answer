package ex3a;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonListServlet
 */
@WebServlet("/PersonListServlet")
public class PersonListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Person> list = new ArrayList<>();
	       list.add(new Person("山田",23));
	       list.add(new Person("田中",33));
	       list.add(new Person("佐藤",33));

			response.setContentType("text/html;charset=UTF-8");
			
			PrintWriter out = response.getWriter();
			
			out.println("<html><head><title>PersonList</title></head><body>");
			out.println("<h1>PersonList</h1>");
			out.println("<table border=\"1\">");
			out.println("<tr><th>氏名</th><th>年齢</th></tr>");
			for (Person person : list) {
				out.println("<tr>");
				out.println("<td>" + person.getName() + "</td>");
				out.println("<td>" + person.getAge() + "</td>");
				out.println("</tr>");
				
			}
			
			
			out.println("</table>");
			
	}

}
