class A {
	public void aaa() {}
}
class B extends A {
	public void aaa() {}
}

public class Exam_04 {
	public static void main(String[] ar) {
		A ap = new A();
		B bp = new B();
		A cp = new B();
		
		boolean a = ap instanceof A;
		boolean b = bp instanceof B;
		boolean c = cp instanceof B;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
