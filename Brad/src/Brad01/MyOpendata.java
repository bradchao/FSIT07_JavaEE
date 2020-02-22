package Brad01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MyOpendata {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties info = new Properties();
			info.put("user", "root");
			info.put("password", "root");
			info.put("serverTimezone", "Asia/Taipei");
			
			Connection conn = 
				DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/iii", info);
			String sql = 
				"INSERT INTO opendata (cname,address,tel,latlng,picurl) VALUES (?,?,?,?,?)";
			PreparedStatement pstmt = 
				conn.prepareStatement(sql);
			
			
			
			
			
			
			
			
			
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
