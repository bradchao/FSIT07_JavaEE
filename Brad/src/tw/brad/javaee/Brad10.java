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
		String op = request.getParameter("op");
		int intX, intY; 
		double result; 
		result = intX = intY = 0;
		
		if (x != null) {
			try {
				intX = Integer.parseInt(x);
				intY = Integer.parseInt(y);
				switch(op) {
					case "1": result = intX + intY; break;
					case "2": result = intX - intY; break;
					case "3": result = intX * intY; break;
					case "4": result = intX*1.0 / intY; break;
				}
				
			}catch(Exception e) {}
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.append("<h1>Brad Big Company</h1>")
		.append("<hr />")
		.append("<form action='Brad10' method='get'>")
		.append("<input type='text' name='x' value='" + intX + "'>")
		.append("<select name='op'>")
		.append("<option value='1'>+</option>")
		.append("<option value='2'>-</option>")
		.append("<option value='3'>x</option>")
		.append("<option value='4'>/</option>")
		.append("</select>")
		.append("<input type='text' name='y' value='" + intY + "'>")
		.append("<input type='submit' value='=' />")
		.append("" + result)
		.append("</form>");
		response.flushBuffer();
	
	}

}
