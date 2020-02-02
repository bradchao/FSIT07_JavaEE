package tw.brad.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad09")
public class Brad09 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		int intX = Integer.parseInt(x);
		int intY = Integer.parseInt(y);
		int result = intX + intY;
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(intX + " + " + intY + " = " + result);
		response.flushBuffer();
	}

}
