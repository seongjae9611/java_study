
public class Exam_08 {
	public static void aaa() {
		try {
			System.out.println("A");
			int tot = 10 / 0 ;
			System.out.println("tot = " + tot);
			return;
		}catch(ArithmeticException e) {
			System.out.println("���� 0���� ���� �� �����ϴ�.");
			return;
		}finally {
			System.out.println("aaa ó���Ϸ�");
		}
	}
	
	public static void main(String[] ar) {
		aaa();
	}
}
