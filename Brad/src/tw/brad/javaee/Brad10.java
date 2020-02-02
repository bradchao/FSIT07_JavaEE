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
		
		request.setCharacterEncoding("UTF-8");
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		int intX, intY, result; 
		result = intX = intY = 0;
		
		if (x != null) {
			try {
				intX = Integer.parseInt(x);
				intY = Integer.parseInt(y);
				result = intX + intY;
			}catch(Exception e) {}
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.append("<h1>Brad Big Company</h1>")
		.append("<hr />")
		.append("<form action='Brad10' method='get'>")
		.append("<input type='text' name='x' value='" + intX + "'>")
		.append("<select>")
		.append("<option>+</option>")
		.append("<option>-</option>")
		.append("<option>x</option>")
		.append("<option>/</option>")
		.append("</select>")
		.append("<input type='text' name='y' value='" + intY + "'>")
		.append("<input type='submit' value='=' />")
		.append("" + result)
		.append("</form>");
		response.flushBuffer();
	
	}

}
