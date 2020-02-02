package tw.brad.javaee;

public class Brad16 {
	private int x, y;
	
	public Brad16(String x, String y) {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
	}
	public double operation() {
		return x + y;
	}
}
