
public class Exam_08 {
	public static void aaa() {
		try {
			System.out.println("A");
			int tot = 10 / 0 ;
			System.out.println("tot = " + tot);
			return;
		}catch(ArithmeticException e) {
			System.out.println("수는 0으로 나눌 수 없습니다.");
			return;
		}finally {
			System.out.println("aaa 처리완료");
		}
	}
	
	public static void main(String[] ar) {
		aaa();
	}
}
