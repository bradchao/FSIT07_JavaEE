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
		
		System.out.println(account + ":" + passwd + ":" + gender);
	}

}
