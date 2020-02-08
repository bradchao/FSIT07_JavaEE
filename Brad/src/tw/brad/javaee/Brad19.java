package tw.brad.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.brad.myutils.BCrypt;

@WebServlet("/Brad19")
public class Brad19 extends HttpServlet {
	public Brad19() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		
		if (account == null) return;
		
		String hashPW = BCrypt.hashpw(passwd, BCrypt.gensalt());
		int result = add2MySQL(account, hashPW);
		out.println("add : " + result);
		response.flushBuffer();
	}
	
	private int add2MySQL(String account, String passwd) {
		int ret = 0;
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/iii",prop);
			String sql = 
				"INSERT INTO cust (account,passwd) VALUES (?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account);
			pstmt.setString(2, passwd);
			ret = pstmt.executeUpdate();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return ret;
		
		
	}

}
