
public class Exam_13 {
	public static boolean aaa() {
		System.out.println("AAA");
		return false;
	}
	public static boolean bbb() {
		System.out.println("BBB");
		return true;
	}
	public static void main(String[] ar) {
		boolean bool = aaa() & bbb();
		System.out.println("bool = " + bool);
	}
}
