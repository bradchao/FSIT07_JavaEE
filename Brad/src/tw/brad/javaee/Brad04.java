package tw.brad.javaee;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad04")
public class Brad04 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		BufferedReader reader = request.getReader();
		String line;
		while ( (line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
	}

}
