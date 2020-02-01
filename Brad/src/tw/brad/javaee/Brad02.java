package tw.brad.javaee;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad02")
public class Brad02 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,String[]> map = request.getParameterMap();
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String[] values = map.get(key);
			System.out.println(key + ":");
			for (String value : values) {
				System.out.println(value);
			}
			System.out.println("----");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
