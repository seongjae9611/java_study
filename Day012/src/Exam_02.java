class Outer1 {
	private int x = 100;
	private static int y = 200;
	public Outer1() {}
	public void disp() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	static class Inner1 {
		private int a = 10;
		static int b = 20;
		public Inner1() {}
		public void disp_in() {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("y = " + y);
		}
	}
}
public class Exam_02 {
	public static void main(String[] ar) {
		Outer1.Inner1 oi = new Outer1.Inner1();
		oi.disp_in();
		System.out.println("b = " + Outer1.Inner1.b);
	}
}
