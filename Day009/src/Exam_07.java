
public class Exam_07 {
	public static void main(String[] ar) {
		Exam_05 ex = new Exam_05();
		System.out.println("ex.a = " + ex.a);
		Exam_05 ex1 = ex;
		ex = null;
		ex1 = null;
	}
}
