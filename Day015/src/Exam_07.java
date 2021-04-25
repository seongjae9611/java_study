import java.io.*;
public class Exam_07 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int su1 = 0, su2 = 0, tot = 0;
		try {
			System.out.print("su1 = ");
			su1 = Integer.parseInt(in.readLine());	
			System.out.print("su2 = ");
			su2 = Integer.parseInt(in.readLine());
			tot = su1 / su2;
			System.out.println("tot = " + tot);
			
		}catch(NumberFormatException e) {
			System.out.println("숫자 포맷이 잘못되었습니다.");
			System.exit(0);
		}catch(ArithmeticException e) {
			System.out.println("나눗셈에선 0은 사용할 수 없습니다.");
			System.exit(0);
		}
	}
}
