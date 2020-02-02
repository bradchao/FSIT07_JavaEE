package tw.brad.javaee;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/Brad07")
@MultipartConfig(
		location = 
		"C:\\Users\\user\\git\\repository\\Brad\\WebContent\\upload")
public class Brad07 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String prefix = request.getParameter("prefix");
		System.out.println(prefix);
		
		// enctype="multipart/form-data"
		// MUST BE => @MultipartConfig 
		Collection<Part> parts = request.getParts();
		System.out.println("size = " +parts.size());
		int i=1;
		for (Part part : parts) {
			
			String type = part.getContentType();
			
			String name = part.getName();
			String sname = part.getSubmittedFileName();
			
			if (name.equals("upload")) {
				if (sname.length() == 0) continue;
				
				System.out.println(sname + ":" + type);
				part.write(createFileName(prefix, i++));
			}
			
		}
	
	}
	
	private String createFileName(String fname, int i) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.DAY_OF_MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		return fname + year+"_"+month+"_"+day+"_"+i+".jpg";
	}

}
