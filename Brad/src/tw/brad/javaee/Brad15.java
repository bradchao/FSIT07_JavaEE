package tw.brad.javaee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad15")
public class Brad15 extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 0: prepare
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String op = request.getParameter("op");
		if (x == null) x = "0";
		if (y == null) y = "0";
		if (op == null) op = "1";
		
		// 1: model
		Brad16 model = new Brad16(x, y, op);
		double result = model.operation();
		
		// 2. view
		RequestDispatcher dispatcher =
			request.getRequestDispatcher(
				String.format(
				"Brad17?x=%s&op=%s&y=%s&result=%s&filename=%s", 
				x, op, y, result, "view2.html"));
		dispatcher.forward(request, response);
	
	}

}
