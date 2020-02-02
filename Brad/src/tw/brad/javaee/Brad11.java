package tw.brad.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad11")
public class Brad11 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String name = request.getParameter("name");
		if (name == null) {
			name = "World";
		}
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("Brad12?name="+name);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>Brad Big Company</h1><hr />");
		
		dispatcher.include(request, response);
		
		dispatcher = 
				request.getRequestDispatcher("brad05.html");
		dispatcher.include(request, response);
		
		out.println("I am Brad<hr />");
	}

}
