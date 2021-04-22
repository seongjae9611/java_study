
public class Exam_03 {
	private int x;
	private int y;

	public Exam_03() {
		x = 10;
		y = 20;
	}
	public Exam_03(int a) {
		x = a;
		y = 20;
	}
	public Exam_03(int a, int b) {
		x = a;
		y = b;
	}
	
	public Exam_03(float a) {}
	public Exam_03(char a) {}
	
	void disp() {
		System.out.println("Ãâ·Â");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}
	
}
