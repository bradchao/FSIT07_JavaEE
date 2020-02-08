package tw.brad.javaee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad22")
public class Brad22 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		BufferedImage bimg = ImageIO.read(new File("C:\\Users\\user\\git\\repository\\Brad\\WebContent\\upload\\test1.jpg"));
		Graphics2D g2d = bimg.createGraphics();

		Font myfont = new Font(null, Font.BOLD + Font.ITALIC, 48); 
		
		AffineTransform tran = new AffineTransform();
		tran.rotate(Math.toRadians(-45),0,0);
		Font font2 = myfont.deriveFont(tran);
		
		g2d.setFont(font2);
		g2d.setColor(Color.YELLOW);
		g2d.drawString("Hello, World", 80, 180);
		
		response.setContentType("text/html; charset=UTF-8");
		FileOutputStream fout = new FileOutputStream(new File("C:\\Users\\user\\git\\repository\\Brad\\WebContent\\upload\\test2.jpg"));
		ImageIO.write(bimg, "jpeg", fout);
		fout.flush();
		fout.close();
		
		response.setContentType("image/jpeg");
		OutputStream oout = response.getOutputStream();
		ImageIO.write(bimg, "jpeg", oout);
		oout.flush();
		oout.close();
		
		
	}
}
