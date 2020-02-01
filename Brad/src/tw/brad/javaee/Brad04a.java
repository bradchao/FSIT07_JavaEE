package tw.brad.javaee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad04a")
public class Brad04a extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
//		InputStream in = request.getInputStream();
//		byte[] buf = new byte[4096]; int len;
//		while ( (len = in.read(buf)) != -1) {
//			System.out.print(new String(buf, 0, len));
//		}
//		in.close();

		System.out.println("----------------");
		String ok = request.getParameter("ok");
		System.out.println(ok);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
