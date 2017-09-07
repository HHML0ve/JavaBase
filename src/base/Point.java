package base;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	
	public String Show() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	

}
