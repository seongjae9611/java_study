import java.io.*;
public class Exam_06 {
	public static void main(String[] ar) throws IOException {
		int su = 0;
		
		System.out.print("su = ");
		su = System.in.read() - 48;
		
		if (su == 0) {
			System.out.println("당신은 서울 출생이시군요");
		}
		else if (su == 1) {
			System.out.println("당신은 경기, 인천 출생이시군요");
		}
		else if (su == 9) {
			System.out.println("당신은 제주도 출생이시군요");
		}
	}
}
