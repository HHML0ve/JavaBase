package base;

public class Lader {
	private float a;
	private float b;
	private float c;
	
	public void setDemo(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public float area(){
		return (float) ((a+b)*c*0.5);		
	}

	public Lader(float a, float b, float c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Lader() {
		super();
	}

	
}
