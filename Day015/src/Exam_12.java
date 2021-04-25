import java.io.*;
public class Exam_12 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("x = ");
		int x = Integer.parseInt(in.readLine());
		//System.out.println("x = " + x);
		assert x > 5 : "if문 테스트 위한 거니 5보다 크게 넣어주세요"; //개발자에겐 중요한 문구 (사용자에겐 중요하지 않음)
		if (x >= 5) {
			System.out.println("5보다 크거나 같은 영역입니다.");
		}
		else {
			System.out.println("5보다 작은 영역입니다.");
		}
	}
}
