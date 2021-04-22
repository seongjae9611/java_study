
class Exam_01_Sub {
	private int x = 100;
	private char y = 'A';
	public void viewX() {
		System.out.println("x = " + x);
	}
	public void viewY() {
		System.out.println("y = " + y);
	}
	
	
}

public class Exam_01 {
	public static void main(String[] ar) {
		Exam_01_Sub ex = new Exam_01_Sub();
//		System.out.println("x = " + ex.x);
		ex.viewX();
//		System.out.println("y = " + ex.y);
		ex.viewY();
	}
}
