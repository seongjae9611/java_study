class D {
	private int a, b, c, d, e, f;
	public D() {
		a = 200; b = 200; c = 300;
		d = 400; e = 500; f = 600;
	}
	public D(int c) {
		this();
		this.c = c;
	}
}
class E extends D {
	private int g, h, i;
	public E() {
		super();
		g = 700; h = 800; i = 900;
	}
}
	

public class Exam_04 {
	public static void main(String[] ar) {
		
	}
}
