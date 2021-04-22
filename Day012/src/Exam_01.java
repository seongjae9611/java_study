class Outer {
	private int x = 100;
	private static int y = 200;
	private Outer() {}
	public void disp() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	class Inner {
		private int a = 100;
		public Inner() {}
		public void disp_in() {
//			System.out.println("a = " + a);
			System.out.println("x = " + x);
//			System.out.println("y = " + y);
			disp();
		}
		class Other_Inner {}
	}
}
public class Exam_01 {
	public static void main(String[] ar) {
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner();
		ot.x = 700;
		oi.disp_in();
		Outer.Inner.Other_Inner oio = oi.new Other_Inner();
		System.out.println();
		
		Outer ot1 = new Outer();
		Outer.Inner oi1 = ot1.new Inner();
		Outer.Inner oi2 = ot1.new Inner();
		oi1.disp_in();
		oi2.disp_in();
	}
}
