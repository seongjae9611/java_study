class Outer2 {
	private int x = 100;
	private static int y = 200;
	public void disp() {
		class Inner2 {
			private int a = 100;
//			private static int b = 20;
			public void disp_in() {
				System.out.println("a = " + a);
				System.out.println("x = " + x);
				System.out.println("y = " + y);
			}
		}
		Inner2 in = new Inner2();
		in.disp_in();
	}
}
public class Exam_04 {
	public static void main(String[] ar) {
		Outer2 ot = new Outer2();
//		Outer2.Inner2 oi = ot.new Inner2();
		ot.disp();
	}
}
