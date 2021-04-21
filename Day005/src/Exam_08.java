
public class Exam_08 {
	public static void main(String[] ar) {
		int x = 10;
		float y = 3;
		System.out.println("몫 = " + x / y);
		System.out.println("나머지 = " + x % y);
		//정수끼리 계산할땐 정수가 나오게 됨
		
		
		byte a = 10;
		byte b = 20;
//		byte c = a + b;
		int c = a + b;
		//인티저보다 작은 연사자를 연산할 땐 인티저를 따라가게 됨
		
		long d = 10L;
		int e = 10;
//		int f = d + e;
		long f = d + e;
		
		float g = 10.3f;
		long h = 10L;
//		long i = g + h;
		float i = g + h;
		
		//인티저보다 큰 연산자를 연산할땐 큰 연사자를 따라가게 됨
		
	}
}
