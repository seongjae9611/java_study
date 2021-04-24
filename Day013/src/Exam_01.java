class A extends Object {
	public void aaa() {
		System.out.println("A클래스");
	}
}
public class Exam_01 extends Object {
	public static void main(String[] ar) {
		A ap= new A();
		ap.aaa();
		System.out.println("클래스 = " + ap.getClass());
		System.out.println("toString() = " + ap.toString());
	}

}
