package tw.brad.javaee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad17")
public class Brad17 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String result = request.getParameter("result");
		
		String html = loadView();
		out.print(String.format(html, x,y,result));
		response.flushBuffer();
		
		
	}
	
	private String loadView() {
		ServletContext context = getServletContext();
		String viewPath = context.getInitParameter("viewPath");
		
		StringBuffer sb = new StringBuffer();
		try {
			BufferedReader reader = 
				new BufferedReader(new FileReader(
						new File(viewPath, "view2.html")));
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			reader.close();
		}catch(Exception e) {
			
		}
		
		return sb.toString();
	}
	
	

}
