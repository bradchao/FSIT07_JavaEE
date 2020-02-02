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
		if (x == null) x = "0";
		if (y == null) y = "0";
		
		// 1: model
		Brad16 model = new Brad16(x, y);
		double result = model.operation();
		
		// 2. view
		RequestDispatcher dispatcher =
				request.getRequestDispatcher(
						String.format("Brad17?x=%s&y=%s&result=%s", 
								x, y, result));
		dispatcher.forward(request, response);
	
	}

}
