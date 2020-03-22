package tw.brad.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

@WebServlet("/Brad24")
public class Brad24 extends HttpServlet {
	public Brad24() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		response.setContentType("application/json; charset=UTF8");
		PrintWriter out = response.getWriter();

		try {
			JSONArray root = new JSONArray();
			
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/iii",prop);
			String sql = 
				"SELECT * FROM cust";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				//rs.getString("id")
				HashMap<String,String> row = new HashMap<>();
				row.put("id", rs.getString("id"));
				row.put("account", rs.getString("account"));
				row.put("passwd", rs.getString("passwd"));
				row.put("realname", rs.getString("realname"));
				
				root.put(row);
			}
			
			out.print(root.toString());
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
