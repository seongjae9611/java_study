class A extends Object {
	public void aaa() {
		System.out.println("AŬ����");
	}
}
public class Exam_01 extends Object {
	public static void main(String[] ar) {
		A ap= new A();
		ap.aaa();
		System.out.println("Ŭ���� = " + ap.getClass());
		System.out.println("toString() = " + ap.toString());
	}

}
