package tw.brad.javaee;

public class Brad16 {
	private int x, y, op;
	
	public Brad16(String x, String y, String op) {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
		this.op = Integer.parseInt(op);
	}
	public double operation() {
		switch(op) {
			case 1: return x + y;
			case 2: return x - y;
			case 3: return x * y;
			case 4: return x*1.0 / y;
			default: return 0;
		}
		//return x + y;
	}
}
