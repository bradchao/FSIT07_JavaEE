package tw.brad.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad20")
public class Brad20 extends HttpServlet {
	private static final String sql =
			"SELECT * FROM cust WHERE account = ?";
	private static PreparedStatement pstmt;
	private boolean isMysqlOK;
	
	
    public Brad20() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/iii",prop);
			pstmt = conn.prepareStatement(sql);
			isMysqlOK = true;
		}catch(Exception e) {
			System.out.println(e.toString());
		}    
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		
		if (account == null || !isMysqlOK) {
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Server Busy!");
			return;
		}
		
		boolean isAccountOK = checkAccount(account, passwd);
		if (isAccountOK) {
			response.sendRedirect("main.html");
		}else {
			response.sendRedirect("brad07.html");
		}
		
	}
	
	private boolean checkAccount(String account, String passwd) {
		boolean isPWOK = false;
		try {
			pstmt.setString(1, account);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String hashPW = rs.getString("passwd");
				isPWOK = BradAPIs.chPassword(passwd, hashPW);
			}
		}catch(Exception e) {
			
		}
		return isPWOK;
	}
	
	

}
