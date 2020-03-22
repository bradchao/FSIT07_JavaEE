package tw.brad.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

@WebServlet("/Brad23")
public class Brad23 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("application/json; charset=UTF8");
		PrintWriter out = response.getWriter();
		
		try {
			JSONArray root = new JSONArray();
			HashMap<String,String> d0 = new HashMap<>();
			d0.put("name", "Brad");
			d0.put("age", "18");
			root.put(0, d0);
			
			HashMap<String,String> d1 = new HashMap<>();
			d1.put("name", "Brad2");
			d1.put("age", "19");
			root.put(1, d1);
			
			out.print(root.toString());
		}catch (Exception e) {
			out.println(e.toString());
		}
		
		
		
		
		
		
		
	}
}
