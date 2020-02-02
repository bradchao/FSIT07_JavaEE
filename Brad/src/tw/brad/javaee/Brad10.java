package tw.brad.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad10")
public class Brad10 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.append("<h1>Brad Big Company</h1>")
		.append("<hr />")
		.append("<form action='Brad09' method='get'>")
		.append("<input type='text' name='x'>")
		.append("+")
		.append("<input type='text' name='y'>")
		.append("<input type='submit' value='=' />")
		.append("</form>");
		response.flushBuffer();
	
	}

}
