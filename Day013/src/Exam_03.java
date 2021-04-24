import java.lang.*;
class AAA extends Object {
	private int x;
	public AAA() {
		
	}
	public void disp() {
		System.out.println("x = " + this.x);
	}
}

public class Exam_03 extends Object {
	public static void main(String[] ar) {
		AAA ap = new AAA();
	}
}
