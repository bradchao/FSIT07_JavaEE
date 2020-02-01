package tw.brad.javaee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad03")
public class Brad03 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		//String like = request.getParameter("like");
		String area = request.getParameter("area");
		String memo = request.getParameter("memo");
		
		System.out.println(account + ":" + passwd 
				+ ":" + gender + ":" + area + ":" + memo);
		String[] likes = request.getParameterValues("like");
		if (likes != null) {
			for (String like : likes) {
				System.out.println(like);
			}
		}
		
		
		
	}

}
