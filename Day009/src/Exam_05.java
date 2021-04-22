
public class Exam_05 {
	int x;
	int y;
	int a;
	int b;
	int c;
	
	public Exam_05() {
		this.x = 10;
		this.y = 20;
		a = 100;
		b = 200;
		c = 300;
	}
	public Exam_05 (int x) {
		this();
		this.x = x;		
	}
	public Exam_05 (int x, int y) {
		this(x);
		this.y = y;
		
	}
	public void disp() {
		System.out.println("x = " + x);
		System.out.println("x = " + y);
	}
}
